package Arrays;



/*
 * <metadata>
 *   Name:- Left and Right Sum Differences,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9000/codebase/LeftRightSumDiffer.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/left-and-right-sum-differences/description/,
 *   Date:- 2024-03-08,
 *   Level:- Easy,
 *   Notes:- Three Arrays two for saving running sums and one to save the result,
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
