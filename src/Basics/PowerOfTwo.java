package Basics;

/*
 * <metadata>
 * <name>Power of Two</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Power_of_Two.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/power-of-two</url>
 * <date>2024-02-14</date>
 * <level>Easy</level>
 * <notes>Use log or BitWise Manipulation</notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class PowerOfTwo {

    /*
    * Althrough It works in real mathematics it will not work in java due to inaccuracy of precision
    * */
    public static boolean isPowerOfTwo(int n) {
        double temp = (Math.log(n)/Math.log(2));
        return temp % 1 == 0;
    }

    public static boolean isPowerOfTwoBit(int n) {
        return (n & (n-1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwoBit(536870912));
    }
}
