package Extra_Problems.Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 *   Name:- Check if the Sentence Is Pangram,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Pangram_Sentence.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/check-if-the-sentence-is-pangram,
 *   Date:- 2024-02-20,
 *   Level:- Easy,
 *   Companies:- Facebook:Goldman Sachs,
 *   Notes:- Use Set and check it is of 26 size,
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
