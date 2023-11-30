package Strings;
import java.util.*;
/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/anagram-difference_799485
 * </metadata>
 * */
public class AnagramDifference {

    public static int getMinimumAnagramDifference(String str1, String str2) {
        int result=0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch: str2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)-1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            result+=Math.abs(entry.getValue());
        }

        return result/2;
    }
    public static void main(String[] a) {
        System.out.println(getMinimumAnagramDifference("aa", "bb"));
    }

}
