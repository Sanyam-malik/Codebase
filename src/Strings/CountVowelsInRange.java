package Strings;


/*
 * <metadata>
 * <name>Count Vowel Strings in Ranges</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Count_Vowel_String_Range.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/count-vowel-strings-in-ranges/description/</url>
 * <date>2024-03-08</date>
 * <level>Medium</level>
 * <remarks>Needs Algorithm Improvement</remarks>
 * <notes>Solution 1 Hint - Naive Approach Using Boolean Array to store the result of each word and according to queries calculate count and save the result (TLE Error)</br></br></notes>
 * </metadata>
 * */
public class CountVowelsInRange {

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] result = new int[queries.length];

        boolean[] isVowel = new boolean[words.length];
        int index = 0;
        for(String word: words) {
            isVowel[index++] = containsVowel(word);
        }

        for(int q = 0; q < queries.length; q++) {
            int start = queries[q][0];
            int end = queries[q][1];

            int count = 0;
            for(int i=start; i <= end; i++) {
                count += isVowel[i] ? 1 : 0;
            }
            result[q] = count;

        }

        return result;
    }


    public static boolean containsVowel(String s) {
        s = s.toLowerCase();
        if(s.length() == 0) {
            return false;
        } else {
            char start = s.charAt(0);
            char end = s.charAt(s.length() - 1);

            if((start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') && (end == 'a' || end == 'e' | end == 'i' || end == 'o' || end == 'u')) {
                return true;
            }
        }

        return false;
    }

}
