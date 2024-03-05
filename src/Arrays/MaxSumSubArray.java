package Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 *   Name:- Maximum Sum of Distinct Subarrays With Length K,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMTgtNDEtMjcucG5n&version_id=null">,
 *   Status:- Needs Improvement,
 *   URL:- https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k,
 *   Date:- 2024-02-12,
 *   Level:- Medium,
 *   Notes:- Solution1 - Uses the sliding window property with length k if the elements are distinct then check for equals if not then slide by 1 element</br></br>
 *          Solution2 - Uses the Prefix Sum Technique with window shrinking,
 * </metadata>
 * */
public class MaxSumSubArray {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long max = 0, sum = 0;
        int windowStart = 0;
        for (int i = 0; i < nums.length; i++) {
            while (set.contains(nums[i]) || set.size() == k) {
                set.remove(nums[windowStart]);
                sum -= nums[windowStart++];
            }
            sum += nums[i];
            set.add(nums[i]);
            if (set.size() == k) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
