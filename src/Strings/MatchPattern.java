package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/match-specific-pattern_981301
 * </metadata>
 * */
public class MatchPattern {

    public static List<String> matchSpecificPattern(List<String> words, int n, String pattern) {

        // Write you code here.
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.size();i++){
            if(match(words.get(i),pattern)){
                ans.add(words.get(i));
            }
        }
        return ans;
    }

    static boolean match(String s,String pattern){
        if(s.length() != pattern.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();

        Map<Character,Character> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),pattern.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            map2.put(pattern.charAt(i),s.charAt(i));
        }
        if(map.size() != map2.size()){
            return false;
        }
        for(Map.Entry<Character,Character> entry : map.entrySet()){
            if(map2.get(entry.getValue()) != entry.getKey()){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] a) {
        List<String> words = new ArrayList<>(List.of("a", "b", "c", "&", "%", "#"));
        String pattern = "u";
        System.out.println(matchSpecificPattern(words, words.size(), pattern));
    }
}
