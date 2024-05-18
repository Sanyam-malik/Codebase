package Arrays;



/*
 * <metadata>
 * <name>Minimum Average Difference</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Minimum_Average_Difference.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/minimum-average-difference/description/</url>
 * <date>2024-03-24</date>
 * <level>Medium</level>
 * <notes>Use Prefix Sum Technique</notes>
 * <remark></remark>
 * <companies>Amazon</companies>
 * </metadata>
 * */
public class MinimumAverageDifference {

    public static int minimumAverageDifference(int[] nums) {
        if(nums.length == 1) return 0;
        int[] preSum = new int[nums.length];
        int[] suffSum = new int[nums.length];
        preSum[0] = nums[0];
        suffSum[nums.length-1] = nums[nums.length-1];
        for(int i=1; i< nums.length; i++) {
            int j = nums.length- 1-i;
            preSum[i] = preSum[i-1] + nums[i];
            suffSum[j] = suffSum[j+1] + nums[j];
        }

        int result = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0; i< nums.length; i++) {
            int leftElems = i+1;
            int rightElems = nums.length - leftElems;
            int leftCal = (preSum[i]/leftElems);
            int rightCal = rightElems > 0 ? (suffSum[i+1]/rightElems) : 0;
            int cal = Math.abs(leftCal - rightCal);
            if( cal < result) {
                result = cal;
                index = i;
            }
        }
        return index;
    }

    public static void main(String args[]) {
        System.out.println(minimumAverageDifference(new int[]{0,1,0,1,0,1}));
    }

}
