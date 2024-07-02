package Basics;

public class PrimeNumbers {

    static int isPrime(int N) {
        if (N <= 1) {
            return 0; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 0; // N is divisible by i, hence not a prime number
            }
        }

        return 1; // N is a prime number
    }
}
