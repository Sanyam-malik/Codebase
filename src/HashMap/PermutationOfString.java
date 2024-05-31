package HashMap;

import java.util.HashMap;
import java.util.Map;



/*
 * <metadata>
 * <name>Permutation in String</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/PermutationOfString.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/permutation-in-string/description/</url>
 * <date>2024-05-31</date>
 * <level>Medium</level>
 * <notes>Use Sliding Window</notes>
 * <remarks>Good Question</remarks>
 * </metadata>
 * */
public class PermutationOfString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;

        Map<Character, Integer> s1Hash = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            s1Hash.put(ch, s1Hash.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> s2Hash = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s2Hash.put(s2.charAt(i), s2Hash.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if (s1Hash.equals(s2Hash)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            char next = s2.charAt(i);
            char prev = s2.charAt(i - s1.length());

            s2Hash.put(next, s2Hash.getOrDefault(next, 0) + 1);
            s2Hash.put(prev, s2Hash.get(prev) - 1);

            if (s2Hash.get(prev) == 0) {
                s2Hash.remove(prev);
            }

            if (s1Hash.equals(s2Hash)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
