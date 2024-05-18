package Sorting;
import java.util.Arrays;


/*
 * <metadata>
 * <name>Find the Value of the Partition</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/FindPartitionValue.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-the-value-of-the-partition/description/</url>
 * <date>2024-04-15</date>
 * <level>Medium</level>
 * <notes>Just sort and find minimum of adjacent differences</notes>
 * <remarks></remarks>
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
