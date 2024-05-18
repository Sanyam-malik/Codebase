package Arrays;


/*
 * <metadata>
 * <name>Running Sum of 1d Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Running_Sum_1D.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/running-sum-of-1d-array/description/</url>
 * <date>2024-03-11</date>
 * <level>Easy</level>
 * <companies>Microsoft</companies>
 * <notes>Start from index i and add previous values</notes>
 * <remarks></remarks>
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
