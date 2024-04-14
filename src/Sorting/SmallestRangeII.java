package Sorting;
import java.util.*;

/*
 * <metadata>
 *   Name:- Smallest Range II,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Smallest_Range_II.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/smallest-range-ii/,
 *   Date:- 2024-04-14,
 *   Level:- Medium,
 *   Notes:- Find the min and max element everytime,
 *   Remark:- LearnYard Problem:Good Question,
 *   Companies:- Adobe:Amazon:Citadel:Snowflake
 * </metadata>
 * */
public class SmallestRangeII {

    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++)
            result = Math.min(result, getResult(nums, k, i));
        return result;
    }
    private int getResult(int[] nums, int k, int i) {
        if (i == 0)
            return nums[nums.length - 1] - nums[0];
        int max = Math.max(nums[i - 1] + k, nums[nums.length - 1] - k);
        int min = Math.min(nums[0] + k, nums[i] - k);
        return max - min;
    }
}
