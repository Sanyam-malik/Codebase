package Strings;

import java.util.*;

/*
 * <metadata>
 *   Status: InComplete,
 *   URL: https://www.codingninjas.com/studio/problems/shuffle-two-strings_1115692
 * </metadata>
 * */
public class ShuffleStrings {

    public static boolean isInterleave(String a, String b, String c) {
        if (a.length() + b.length() != c.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : a.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : b.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : c.toCharArray()) {
            if (!charCount.containsKey(ch) || charCount.get(ch) == 0) {
                return false;
            }
            charCount.put(ch, charCount.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] a) {
        System.out.println(isInterleave("ab", "bc", "bbac"));
    }
}
