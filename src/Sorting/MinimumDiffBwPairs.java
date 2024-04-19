package Sorting;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Minimum difference between the pairs of elements</name>
 * <description>Given an array arr find minimum pair of elements such that i != j</description>
 * <status>Completed</status>
 * <url>https://learnyard.com</url>
 * <date>2024-04-05</date>
 * <level>Easy</level>
 * <notes>Just Sort and find the minimum of difference</notes>
 * <remarks>LearnYard Problem</remarks>
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
