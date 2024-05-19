package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/*
 * <metadata>
 * <name>Longest Substring Without Repeating Characters</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/LongestSubStringWithoutRepeat.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/longest-substring-without-repeating-characters/description/</url>
 * <date>2024-05-19</date>
 * <level>Medium</level>
 * <remarks>Good Question</remarks>
 * <companies>Uber:Zoho:Apple:Adobe:Yahoo:Amazon:Google:VMware:Oracle:Paypal:Intuit:Yandex:Spotify:Samsung:Facebook:JPMorgan:Microsoft:Bloomberg:Salesforce:Goldman Sachs:Walmart Global Tech</companies>
 * <notes><a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/5171143/video-sliding-window-set-hashing-and-the-last-position-3-ways/">View Solution</a></notes>
 * </metadata>
 * */
public class LongestSubStringWithoutRepeat {

    /*
     * Time Complexity: O(n)
     * */
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    /*
    * Time Complexity: O(n)
    * */
    public int lengthOfLongestSubstringAlt(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);

            while (count.get(c) > 1) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    /*
    * Time Complexity: O(n)
    * */
    public int lengthOfLongestSubstringAlt2(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            lastSeen.put(c, right);
        }

        return maxLength;
    }

    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
