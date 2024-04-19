package Extra_Problems.Arrays;

/*
 * <metadata>
 * <name>Running Sum of 1d Array - Revision</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Running_Sum_1D.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/running-sum-of-1d-array</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Microsoft</companies>
 * </metadata>
 * */
public class RunningSum {

    public int[] runningSum(int[] nums) {
        for(int i=1; i< nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
