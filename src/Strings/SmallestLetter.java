package Strings;

import java.util.Arrays;


/*
 * <metadata>
 * <name>Find Smallest Letter Greater Than Target</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/FindSmallestLetter.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/</url>
 * <date>2024-04-17</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Amazon:LinkedIn:Bloomberg</companies>
 * <remarks></remarks>
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
