package Strings;

/*
 * <metadata>
 * <name>Valid Anagram</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ValidAnagram.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/valid-anagram/description/</url>
 * <date>2024-03-06</date>
 * <level>Easy</level>
 * <companies>Apple:Amazon:Affirm:Google:Spotify:Facebook:Bloomberg:Microsoft:Goldman Sachs</companies>
 * <notes>Solution - Create an array or use a hashmap</notes>
 * </metadata>
 * */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
