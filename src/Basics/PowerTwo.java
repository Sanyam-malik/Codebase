package Basics;

public class PowerTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of two
        }

        // Check if there is exactly one '1' bit in the binary representation of n
        return (n & (n - 1)) == 0;
    }
}
