package Strings;

/*
 * <metadata>
 * <name>Valid Palindrome</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ValidPalindrome.png"></description>
 * <url>https://leetcode.com/problems/valid-palindrome/description/</url>
 * <date>2024-03-05</date>
 * <level>Easy</level>
 * <companies>Apple:Adobe:Amazon:Yandex:Wayfair:Facebook:Microsoft:Bloomberg:AmericanExpress</companies>
 * <notes>Solution 1 -  Two Pointers Approach left++ and right-- according to the item at left or right and if start is not equal to end return false default true</br></br>       Solution 2 - Using StringBuilder build a new String.</notes>
 * </metadata>
 * */
public class ValidPalindrome {

    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c - 'A' + 'a');
        }
        return c;
    }

    private boolean isLetterOrDigit(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char start = toLowerCase(s.charAt(left));
            char end = toLowerCase(s.charAt(right));

            if(!isLetterOrDigit(start)){
                left++;
                continue;
            }

            if(!isLetterOrDigit(end)){
                right--;
                continue;
            }

            if(start != end)
                return false;

            left++;
            right--;

        }

        return true;


    }
}
