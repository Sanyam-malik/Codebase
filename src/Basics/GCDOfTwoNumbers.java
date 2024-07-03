package Basics;

/*
 * <metadata>
 * <name>GCD of two numbers</name>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1</url>
 * <date>2024-07-02</date>
 * <level>Easy</level>
 * </metadata>
 * */
public class GCDOfTwoNumbers {
    public static int gcd(int a, int b) {
        if (a==0) { return b; }
        else {
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            return gcd(max%min, min);
        }
    }
}
