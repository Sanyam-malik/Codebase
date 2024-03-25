# Euclidean Algorithm

The Euclidean algorithm is an efficient method for computing the greatest common divisor (GCD) of two integers.

## Problem Type

This algorithm is used to solve problems related to finding the greatest common divisor of two numbers.

## Implementation

It recursively calculates the GCD of two numbers by taking advantage of the fact that the GCD of two numbers also divides their difference.

### Example

Suppose we want to find the GCD of `a = 48` and `b = 18`.

The GCD would be `6`.

### Java Implementation

```java
public class EuclideanAlgorithm {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
