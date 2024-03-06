package Arrays;

/*
 * <metadata>
 *   Name:- Valid Palindrome II,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8xLnBuZw==&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/valid-palindrome-ii/description/,
 *   Date:- 2024-03-06,
 *   Companies:- Apple:Amazon:Oracle:Facebook:Microsoft:Bloomberg:WalmartGlobalTec,
 *   Level:- Easy,
 *   Notes:- Solution Hint - If the start and end do not match skip the left or right character if after one skip it becomes palindrome it is true,
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
