package Strings;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Length of the longest substring</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Length_of_longest_substring.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1</url>
 * <date>2024-06-01</date>
 * <level>Medium</level>
 * <companies>Morgan Stanley:Amazon:Microsoft:Google:Synopsys</companies>
 * <notes>Solution 1 Hint - Naive Approach Two for loops</br></br>            Solution 2 Hint - Variable Sliding Window Using Two Pointers starting left</notes>
 * </metadata>
 * */
public class LengthOfLongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        // Initialize the sliding window pointers and the HashSet
        int start = 0, end = 0, maxLength = 0;
        Set<Character> charSet = new HashSet<>();

        // Slide the end pointer from the beginning to the end of the string
        while (end < s.length()) {
            // If the character at end is not in the set, add it and update the max length
            if (!charSet.contains(s.charAt(end))) {
                charSet.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                // If the character is already in the set, remove the character at start and move start
                charSet.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}
