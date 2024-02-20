package KunalHomework.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * <metadata>
 *   Name:- Check if the Sentence Is Pangram,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/check-if-the-sentence-is-pangram,
 *   Date:- 2024-02-20,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
