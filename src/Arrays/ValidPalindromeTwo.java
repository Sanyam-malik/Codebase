package Arrays;

/*
 * <metadata>
 * <name>Valid Palindrome II</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ValidPalindromeII.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/valid-palindrome-ii/description/</url>
 * <date>2024-03-06</date>
 * <companies>Apple:Amazon:Oracle:Facebook:Microsoft:Bloomberg:WalmartGlobalTec</companies>
 * <level>Easy</level>
 * <notes>Solution Hint - If the start and end do not match skip the left or right character if after one skip it becomes palindrome it is true</notes>
 * </metadata>
 * */
public class ValidPalindromeTwo {
    public boolean validPalindrome(String s) {
        char [] chArray = s.toCharArray();
        int start = 0;
        int end = chArray.length-1;
        while (start < end) {
            if(chArray[start] != chArray[end]) {
                // Try skipping the character on the left
                if (isPalindrome(chArray, start + 1, end)) {
                    return true;
                }
                // Try skipping the character on the right
                if (isPalindrome(chArray, start, end - 1)) {
                    return true;
                }

                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public boolean isPalindrome(char[] chArray, int start, int end) {
        while (start < end) {
            if (chArray[start] != chArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
