package Arrays;

/*
 * <metadata>
 * <name>Maximum Average Subarray I</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Maximus_Average_Subarray_I.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-average-subarray-i/description/</url>
 * <date>2024-06-01</date>
 * <level>Easy</level>
 * <companies>Facebook</companies>
 * <notes>Solution 1 Hint - Naive Approach Two for loops</br></br>            Solution 2 Hint - Sliding Window calculate runningSum for first window then reduce the runningSum in other for loop one by one and add next element and calculate tempAverage</notes>
 * </metadata>
 * */
public class MaxSumSubArrayAverage {

    public static double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate the sum of the first 'k' elements.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Initialize the maximum sum as the sum of the first 'k' elements.
        int maxSum = sum;

        // Step 2: Slide the window across the array.
        for (int i = k; i < nums.length; i++) {
            // Update the sum by subtracting the element that is leaving the window
            // and adding the element that is entering the window.
            sum = sum - nums[i - k] + nums[i];

            // Update the maximum sum if the current sum is greater.
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        // Step 3: Calculate the maximum average.
        return (double) maxSum / k;
    }


}
