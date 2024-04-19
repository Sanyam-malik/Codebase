package Basics;

/*
 * <metadata>
 * <name>Palindrome Number</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/PalindromeNo.png"></description>
 * <url>https://leetcode.com/problems/palindrome-number/description/</url>
 * <date>2024-03-05</date>
 * <level>Easy</level>
 * <companies>Uber:Adobe:Apple:Yahoo:Google:Amazon:Facebook:Bloomberg:Accenture</companies>
 * <notes>Solution - Divide and Modulus strategy</notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (original != 0) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }
        return reversed == x;
    }
}
