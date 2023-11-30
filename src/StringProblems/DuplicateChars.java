package StringProblems;

import java.util.ArrayList;
import java.util.*;

/*
 * <metadata>
 *   Status: InComplete,
 *   URL: https://www.codingninjas.com/studio/problems/duplicate-characters_3189116,
 *   Notes: Partially accepted
 * </metadata>
 * */
public class DuplicateChars {

    public class Pair {
        char alphabet;
        int count;

        Pair(char ch, int x) {
            this.alphabet = ch;
            this.count = x;
        }

        public String toString() {
            return "["+this.alphabet+"->"+this.count+"]";
        }
    }

    public ArrayList<Pair> duplicate_char(String s, int n) {
        s = s.trim();
        s = s.replaceAll(" ", "");
        ArrayList<Pair> result = new ArrayList<>();
        Map<Character, Integer> hashMap = new HashMap<>();
        for(char ch: s.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: hashMap.entrySet()) {
            if(entry.getValue() > 1) {
                result.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        return result;
    }

    public static void main(String[] a) {
        DuplicateChars dc = new DuplicateChars();
        System.out.println(dc.duplicate_char("kghplowbxrrendulwhb", 5));
    }
}
