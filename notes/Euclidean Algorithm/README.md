
# Euclidean Algorithm

The Euclidean algorithm is an efficient method for computing the greatest common divisor (GCD) of two integers.

## Implementation

It recursively calculates the GCD of two numbers by taking advantage of the fact that the GCD of two numbers also divides their difference.

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
