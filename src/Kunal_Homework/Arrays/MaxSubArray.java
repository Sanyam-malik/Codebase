package Kunal_Homework.Arrays;



/*
 * <metadata>
 *   Name:- Maximum Subarray,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/maximum-subarray,
 *   Date:- 2024-02-12,
 *   Level:- Medium,
 *   Notes:- No Notes,
 * </metadata>
 * */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int runningSum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++) {
            runningSum += nums[i];
            max = Math.max(runningSum, max);
            if(runningSum < 0) {
                runningSum = 0;
            }
        }
        return max;
    }

}
