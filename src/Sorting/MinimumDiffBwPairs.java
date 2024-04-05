package Sorting;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Minimum difference between the pairs of elements,
 *   Description:- Given an array arr find minimum pair of elements such that i != j,
 *   Status:- Completed,
 *   URL:- https://learnyard.com,
 *   Date:- 2024-04-05,
 *   Level:- Easy,
 *   Notes:- Just Sort and find the minimum of difference,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class MinimumDiffBwPairs {

    static int minimumDifference(int arr[]) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i< arr.length-1; i++) {
            min = Math.min(min, Math.abs(arr[i+1] - arr[i]));
        }
        return min;
    }

    public static void main(String args[]) {
        System.out.println(minimumDifference(new int[]{1, 4, 6, 7, 8, 10}));
    }
}
