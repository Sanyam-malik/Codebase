package Basics;

/*
 * <metadata>
 * <name>Ugly Number</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Ugly_Number.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/ugly-number</url>
 * <date>2024-02-14</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Adobe:Apple:Amazon:Facebook:Bloomberg</companies>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class UglyNumber {

    public static boolean isUgly(int n) {
        while (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 && n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                n = n / 3;
            }
        }

        if(n > 1) {
            return false;
        } else {
             return true;
        }
    }

    public static void main(String args[]) {
        System.out.println(isUgly(14));
    }
}
