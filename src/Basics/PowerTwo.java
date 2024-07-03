package Basics;

/*
 * <metadata>
 * <name>Power of Two</name>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/power-of-two/description/</url>
 * <date>2024-07-02</date>
 * <level>Easy</level>
 * </metadata>
 * */
public class PowerTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of two
        }

        // Check if there is exactly one '1' bit in the binary representation of n
        return (n & (n - 1)) == 0;
    }
}
