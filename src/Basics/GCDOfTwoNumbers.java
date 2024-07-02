package Basics;

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
