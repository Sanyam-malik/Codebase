# Power Exponentiation

Power exponentiation is the process of raising a number to a given power efficiently.

## Implementation

The algorithm uses a divide-and-conquer approach to reduce the number of multiplication operations needed.

```java
public class PowerExponentiation {
    public static long power(int x, int y) {
        if (y == 0)
            return 1;
        long temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        System.out.println(x + " raised to the power of " + y + " is: " + power(x, y));
    }
}
