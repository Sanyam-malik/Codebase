package Arrays;



/*
 * <metadata>
 * <name>Left and Right Sum Differences</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/LeftRightSumDiffer.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/left-and-right-sum-differences/description/</url>
 * <date>2024-03-08</date>
 * <level>Easy</level>
 * <notes>Three Arrays two for saving running sums and one to save the result</notes>
 * </metadata>
 * */
public class LeftRightSumDiff {

    public int[] leftRightDifference(int[] nums) {

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int leftRunningSum = 0;
        for(int i=0; i< nums.length; i++) {
            leftSum[i] = leftRunningSum;
            leftRunningSum += nums[i];
        }

        int rightRunningSum = 0;
        for(int i=nums.length-1; i>=0; i--) {
            rightSum[i] = rightRunningSum;
            rightRunningSum += nums[i];
        }

        int[] ans = new int[nums.length];
        for(int i=0; i< ans.length; i++) {
            ans[i] = (int)Math.abs(leftSum[i]-rightSum[i]);
        }

        return ans;
    }

}
