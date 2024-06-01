package Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Maximum Number of Vowels in a Substring of Given Length</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Number_Vowels_SubString.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/</url>
 * <date>2024-06-01</date>
 * <level>Medium</level>
 * <companies>Amazon</companies>
 * <notes>Wow what a question</br></br>            Solution 1 Hint - Naive Approach Two for loops</br></br>            Solution 2 Hint - Sliding Window calculate vowels for first window then reduce the vowels in other for loop one by one</notes>
 * </metadata>
 * */
public class MaxVowelsSubString {

    public static int maxVowels(String s, int k) {
        // Define a set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // Initialize the count of vowels in the first window of size k
        int currentVowelCount = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }
        }

        // Initialize the maximum vowel count as the count in the first window
        int maxVowelCount = currentVowelCount;

        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
            // Remove the character that is sliding out of the window
            if (vowels.contains(s.charAt(i - k))) {
                currentVowelCount--;
            }
            // Add the character that is sliding into the window
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }
            // Update the maximum vowel count if the current window has more vowels
            if (currentVowelCount > maxVowelCount) {
                maxVowelCount = currentVowelCount;
            }
        }

        return maxVowelCount;
    }
}
