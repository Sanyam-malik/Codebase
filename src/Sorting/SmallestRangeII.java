package Sorting;
import java.util.*;

/*
 * <metadata>
 * <name>Smallest Range II</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Smallest_Range_II.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/smallest-range-ii/</url>
 * <date>2024-04-14</date>
 * <level>Medium</level>
 * <notes>Find the min and max element everytime</notes>
 * <remark>:Good Question</remark>
 * <companies>Adobe:Amazon:Citadel:Snowflake</companies>
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
