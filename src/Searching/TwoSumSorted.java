package Searching;

import java.util.Arrays;


/*
 * <metadata>
 * <name>Two Sum II - Input Array Is Sorted</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/TwoSumII.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/</url>
 * <date>2024-04-18</date>
 * <level>Medium</level>
 * <notes>Two Pointers <br/> <iframe width="560" height="315" src="https://www.youtube.com/embed/l4vR-Crulmk?si=ORTfmfz99slON7ln" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <companies>Adobe:Apple:Yahoo:Amazon:Google:Microsoft</companies>
 * <remarks>LearnYard Problem</remarks>
 * </metadata>
 * */
public class TwoSumSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while (start < end) {
            int addition = numbers[start]+numbers[end];
            if(addition == target) {
                return new int[]{start+1, end+1};
            }
            else if(addition < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{start+1, end+1};
    }
    public static void main(String args[]) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }

}
