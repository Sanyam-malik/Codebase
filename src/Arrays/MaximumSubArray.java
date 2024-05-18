package Arrays;

/*
 * <metadata>
 * <name>Maximum Subarray</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Maximum_Subarray.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-subarray/description/</url>
 * <date>2024-03-12</date>
 * <level>Medium</level>
 * <remarks>Solve Using Divide and Conquer:</remarks>
 * <notes>Solution - Use Kadane's Algorithm</notes>
 * <companies>Uber:Apple:Adobe:Cisco:Paytm:Amazon:Google:Shopee:VMware:Oracle:Samsung:Infosys:LinkedIn:Facebook:JPMorgan:Docusign:Microsoft:Bloomberg:ByteDance:Salesforce:ServiceNow:Goldman Sachs:Walmart Global Tech</companies>
 * </metadata>
 * */
public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int runningSum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++) {
            runningSum += nums[i];
            max = Math.max(runningSum, max);
            if(runningSum < 0) {
                runningSum = 0;
            }
        }
        return max;
    }

}
