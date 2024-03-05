package Basics;

/*
 * <metadata>
 *   Name:- Reverse String,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMTQtMjMtNDgucG5n&version_id=null">,
 *   URL:- https://leetcode.com/problems/palindrome-number/description/,
 *   Date:- 2024-03-05,
 *   Level:- Easy,
 *   Companies:- Uber:Adobe:Apple:Yahoo:Google:Amazon:Facebook:Bloomberg:Accenture,
 *   Notes:- Solution - Divide and Modulus strategy ,
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