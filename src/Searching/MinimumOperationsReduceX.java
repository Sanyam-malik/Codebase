package Searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 * <metadata>
 * <name>Minimum Operations to Reduce X to Zero</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumOperationsReduceX.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/</url>
 * <date>2024-04-26</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/NRamG4Q9LwQ?si=vmEZndeY1d5_cLie" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * </metadata>
 * */
public class MinimumOperationsReduceX {

    public static int minOperations(int[] nums, int x) {
        int currentSum = 0; // Stores the current sum of elements in the array.

        // Calculate the total sum of the array elements.
        for (int num : nums) {
            currentSum += num;
        }

        int n = nums.length; // The length of the array.
        int minOperations = Integer.MAX_VALUE; // Stores the minimum operations required.
        int leftIndex = 0; // Represents the left pointer.

        for (int rightIndex = 0; rightIndex < n; rightIndex++) {
            currentSum -= nums[rightIndex]; // Subtract the element at the right pointer.

            // While the current sum is less than the target 'x' and the left pointer is not exceeding the right pointer:
            while (currentSum < x && leftIndex <= rightIndex) {
                currentSum += nums[leftIndex]; // Add the element at the left pointer.
                leftIndex += 1; // Move the left pointer to the right.
            }

            // If the current sum matches the target 'x', calculate the minimum operations.
            if (currentSum == x) {
                minOperations = Math.min(minOperations, (n - 1 - rightIndex) + leftIndex);
            }
        }

        // Return the minimum operations if found, otherwise return -1.
        return minOperations != Integer.MAX_VALUE ? minOperations : -1;
    }

    public static void main(String args[]) {
        System.out.println(minOperations(new int[]{1,1,4,2,3}, 5));
    }
}
