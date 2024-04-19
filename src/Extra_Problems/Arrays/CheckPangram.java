package Extra_Problems.Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Check if the Sentence Is Pangram</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Pangram_Sentence.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/check-if-the-sentence-is-pangram</url>
 * <date>2024-02-20</date>
 * <level>Easy</level>
 * <companies>Facebook:Goldman Sachs</companies>
 * <notes>Use Set and check it is of 26 size</notes>
 * </metadata>
 * */
public class CheckPangram {

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(char ch: sentence.toCharArray()) {
            set.add(ch);
        }

        return set.size() == 26;
    }

    public static void main(String args[]) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }


}
