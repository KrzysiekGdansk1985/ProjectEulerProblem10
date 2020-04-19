/*
Summation of primes

Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class EulerProblem10 {
    public static void main(String[] args){
        long sumPrimes = 0;

        for (long i = 2; i < 2000000; i++) {
            if (Prime(i)) sumPrimes += i;
        }

        System.out.println("The sum of all the primes below two million is " + sumPrimes + ".");

    }

    public static boolean Prime(long a){
        long s = (long) Math.sqrt(a);

        for (long i = 2; i <= s; i++) if ((a % i) == 0) return false;
        return true;
    }

}
