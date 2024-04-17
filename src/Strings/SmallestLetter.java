package Strings;

import java.util.Arrays;


/*
 * <metadata>
 *   Name:- Find Smallest Letter Greater Than Target,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9000/codebase/FindSmallestLetter.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/,
 *   Date:- 2024-04-17,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Amazon:LinkedIn:Bloomberg,
 *   Remarks:- LearnYard Problem
 * </metadata>
 * */
public class SmallestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        int min_int = Integer.MAX_VALUE;
        for (char letter : letters) {
            int v = letter;
            if (v > (int) target) {
                min_int = Math.min(min_int, v);
            }
        }

        if (min_int == Integer.MAX_VALUE) {
            return letters[0]; // If no greater letter found, return the first letter
        } else {
            return (char) min_int; // Return the next greatest letter
        }
    }

    public static void main(String args[]) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
    }
}
