package WeeklyContest;

import java.util.*;
public class WeekOne {

    static int nextMultiple(int n, int m) {
        return  (n+m-1)/m * m;
    }

    public static String findFreqsequence(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in the string and find the maximum frequency
        int maxFrequency = 0;
        for (char ch : s.toCharArray()) {
            int count = charCount.getOrDefault(ch, 0) + 1;
            charCount.put(ch, count);
            maxFrequency = Math.max(maxFrequency, count);
        }

        // Construct the result string with characters having the maximum frequency
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (charCount.get(ch) == maxFrequency) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static int[] howManyAreAnagrams(int n, int m, String[] a, String[] b) {
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            String s1 = b[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                String s2 = a[j];

                if (areAnagrams(s1, s2)) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }

    private static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] frequency = new int[26];

        for (char ch : s1.toCharArray()) {
            frequency[ch - 'a']++;
        }

        for (char ch : s2.toCharArray()) {
            frequency[ch - 'a']--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] a) {
        String[] s1 = new String[] {"dpees", "sarc", "cars", "dd"};
        String[] s2 = new String[] {"casr", "a"};
        System.out.println(nextMultiple(7, 3));
        System.out.println(findFreqsequence("iaeeufsseses"));
        System.out.println(Arrays.toString(howManyAreAnagrams(s1.length, s2.length, s1, s2)));
    }
}
