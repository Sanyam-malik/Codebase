package Extra_Problems.Arrays;



/*
 * <metadata>
 * <name>Maximum Subarray - Revision</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Maximum_Subarray.png"></description>
 * <url>https://leetcode.com/problems/maximum-subarray</url>
 * <date>2024-02-12</date>
 * <level>Medium</level>
 * <companies>Uber:Apple:Adobe:Cisco:Paytm:Amazon:Google:Shopee:VMware:Oracle:Samsung:Infosys:LinkedIn:Facebook:JPMorgan:Docusign:Microsoft:Bloomberg:ByteDance:Salesforce:ServiceNow:Goldman Sachs:Walmart Global Tech</companies>
 * <notes>No Notes Needed</notes>
 * </metadata>
 * */
public class MaxSubArray {

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
