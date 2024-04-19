package Strings;


import java.util.HashSet;

/*
 * <metadata>
 * <name>Length of the longest substring</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Length_of_longest_substring.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1</url>
 * <date>2024-03-08</date>
 * <level>Medium</level>
 * <companies>Morgan Stanley:Amazon:Microsoft:Google:Synopsys</companies>
 * <notes>Solution 1 Hint - Naive Approach Two for loops</br></br>            Solution 2 Hint - Variable Sliding Window Using Two Pointers starting left</notes>
 * </metadata>
 * */
public class LengthOfLongestSubString {

    int longestUniqueSubsttr(String S){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right=0;
        int max = 0;
        while(right < S.length())
        {
            if(!set.contains(S.charAt(right)))
            {
                set.add(S.charAt(right));
                right++;
            }
            else
            {
                max = Math.max(max,set.size());
                set.remove(S.charAt(left));
                left++;
            }
        }
        max = Math.max(max,set.size());
        return max;
    }

}
