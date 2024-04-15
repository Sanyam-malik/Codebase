package Sorting;
import java.util.Arrays;


/*
 * <metadata>
 *   Name:- Find the Value of the Partition,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/FindPartitionValue.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-the-value-of-the-partition/description/,
 *   Date:- 2024-04-15,
 *   Level:- Medium,
 *   Notes:- Just sort and find minimum of adjacent differences,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class FindPartitionValue {
    public int findValueOfPartition(int[] nums) {
        int n = nums.length, ans = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (var i=0; i < n-1; i++)
            ans = Math.min(ans, nums[i+1] - nums[i]);

        return ans;
    }
}
