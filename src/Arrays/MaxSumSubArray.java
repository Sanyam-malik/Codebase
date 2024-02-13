package Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 *   Name:- Maximum Sum of Distinct Subarrays With Length K,
 *   Status:- Needs Improvement,
 *   URL:- https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k,
 *   Date:- 2024-02-12,
 *   Type:- Medium
 *   Notes:- TLE Error
 * </metadata>
 * */
public class MaxSumSubArray {
        public long maximumSubarraySum(int[] nums, int k) {
            int start=0;
            int end=start+k;

            long maxSum = 0;
            while(start < nums.length && end <= nums.length) {
                long count = additionOfPair(start, end, nums, k);
                if(count > 0) {
                    maxSum = Math.max(maxSum, count);
                }
                // Increments
                start = start+1;
                end = start+k;
            }
            return maxSum;
        }

        long additionOfPair(int start, int end, int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            long count = 0;

            for (int i = start; i < end; i++) {
                set.add(nums[i]);
                count += nums[i];
            }

            if (set.size() < k) {
                return -1;
            }
            return count;
        }
}
