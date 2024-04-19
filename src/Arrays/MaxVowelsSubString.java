package Arrays;

import java.util.HashSet;


/*
 * <metadata>
 * <name>Maximum Number of Vowels in a Substring of Given Length</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Number_Vowels_SubString.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/</url>
 * <date>2024-03-08</date>
 * <level>Medium</level>
 * <companies>Amazon</companies>
 * <notes>Wow what a question</br></br>            Solution 1 Hint - Naive Approach Two for loops</br></br>            Solution 2 Hint - Sliding Window calculate vowels for first window then reduce the vowels in other for loop one by one</notes>
 * </metadata>
 * */
public class MaxVowelsSubString {

    public int maxVowels(String s, int k) {
        HashSet<Character> set= new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int vowel=0;
        for(int i=0;i<k;i++)
            if(set.contains(s.charAt(i))) vowel++;

        int maxvowel=vowel;

        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i-k))) vowel--;
            if(set.contains(s.charAt(i))) vowel++;
            maxvowel= Math.max(maxvowel, vowel);
        }

        return maxvowel;
    }

}
