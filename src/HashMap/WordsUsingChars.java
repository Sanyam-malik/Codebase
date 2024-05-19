package HashMap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * <metadata>
 * <name>Find Words That Can Be Formed by Characters</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/WordsUsingChars.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/</url>
 * <date>2024-05-19</date>
 * <level>Easy</level>
 * <remarks>Good Question</remarks>
 * <companies>Karat:Indeed:Amazon:Google</companies>
 * <notes>Using Maps</notes>
 * </metadata>
 * */
public class WordsUsingChars {

    /*
    * Time Complexity: 0(n*m)
    * */
    public int countCharactersUsingArrayMap(String[] words, String chars) {

        int[] charsCount = new int[26];

        for(int i=0; i<chars.length(); i++) {
            charsCount[chars.charAt(i) - 'a']++;
        }

        int result = 0;

        for(String s:words) {
            int[] sArr = new int[26];

            for(int i=0; i<s.length(); i++) {
                sArr[s.charAt(i) - 'a']++;
            }

            boolean canBeFormed = true;

            for(int i=0; i<26; i++) {

                if (sArr[i] > charsCount[i]) {
                    canBeFormed = false;
                    break;
                }
            }

            if(canBeFormed) result+=s.length();
        }

        return result;
    }

    /*
    * Time Complexity: 0(n*m)
    * */
    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charSet = getMapForString(chars);
        int count = 0;
        for(String word: words) {
            Map<Character, Integer> map = getMapForString(word);
            int total = 0;
            boolean isGood = true;
            for(Character ch: map.keySet()) {
                int occurances = map.get(ch);
                if(!charSet.containsKey(ch)) {
                    isGood = false;
                    break;
                }
                if(charSet.containsKey(ch) && occurances > charSet.get(ch)) {
                    isGood = false;
                    break;
                }
                total += occurances;
            }

            if(isGood) count+=total;
        }
        return count;
    }

    public static Map<Character, Integer> getMapForString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch: str.toCharArray())  {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        return map;
    }

    public static void main(String args[]) {
        System.out.println(countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }
}
