# Sieve of Eratosthenes

The Sieve of Eratosthenes is an efficient algorithm for finding all prime numbers up to a specified integer.

## Problem Type

This algorithm is used to solve problems related to prime number generation.

## Implementation

It works by iteratively marking the multiples of each prime number starting from 2.

### Example

Suppose we want to find all prime numbers up to `n = 30`.

The prime numbers would be `[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]`.

### Java Implementation

```java
import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static List<Integer> generatePrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 30;
        List<Integer> primes = generatePrimes(n);
        System.out.println("Prime numbers up to " + n + ": " + primes);
    }
}
