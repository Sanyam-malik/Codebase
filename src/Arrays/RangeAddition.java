package Arrays;


import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Range Addition,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/RangeAddition.png">,
 *   Status:- Completed,
 *   URL:- https://www.lintcode.com/problem/903/,
 *   Date:- 2024-03-13,
 *   Level:- Medium,
 *   Companies:- Google,
 *   Notes:- At Start index add the k and at end and its inverse and then combine everything back,
 *   Remarks:- LearnYard Problem:Needs Revision of Concept
 * </metadata>
 * */
public class RangeAddition {

    public static int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        for(int[] update: updates) {
            int start = update[0];
            int end = update[1];
            int value = update[2];
            for (int i = start; i <= end; i++) {
                result[i] += value;
            }
        }

        return result;
    }

    public static int[] getModifiedArrayImproved(int n, int[][] operations) {
        int[] increments = new int[n];

        // Keep track of increments for each index
        for (int[] operation : operations) {
            int startIndex = operation[0];
            int endIndex = operation[1];
            int inc = operation[2];

            // Apply increment only at the start and end of the range
            increments[startIndex] += inc;
            if (endIndex + 1 < n) {
                increments[endIndex + 1] -= inc;
            }
        }

        // Apply increments to get the final modified array
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += increments[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(getModifiedArrayImproved(5, new int[][]{{1, 3, 2}, {2, 4, 3}, {0, 2, -2}})));
    }
}
