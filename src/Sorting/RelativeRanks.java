package Sorting;
import java.util.*;


/*
 * <metadata>
 * <name>Relative Ranks</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/RelativeRanks.png"></description>
 * <url>https://leetcode.com/problems/relative-ranks/</url>
 * <date>2024-05-09</date>
 * <level>Easy</level>
 * <companies>Google</companies>
 * <notes>No Notes Needed</notes>
 * <remarks>Solve Using Priority Queue</remarks>
 * </metadata>
 * */
public class RelativeRanks {


    public static String[] findRelativeRanks(int[] score) {

        int[] copyArray = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        int[] arrayMap = new int[copyArray[0]+1];

        for(int i=0; i<copyArray.length; i++) {
            arrayMap[copyArray[i]] = i+1;
        }

        String[] strArray = new String[score.length];

        for(int i=0; i< score.length; i++) {
            int position = arrayMap[score[i]];
            String replaceM = Integer.toString(position);
            if(position == 1) {
                replaceM = "Gold Medal";
            }
            else if(position == 2) {
                replaceM = "Silver Medal";
            }
            else if(position == 3) {
                replaceM = "Bronze Medal";
            }
            strArray[i] = replaceM;
        }
        return strArray;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{10,3,8,9,4})));
    }
}
