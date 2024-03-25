package Kunal_Homework.Arrays;



/*
 * <metadata>
 *   Name:- Maximum Subarray,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Maximum_Subarray.png">,
 *   URL:- https://leetcode.com/problems/maximum-subarray,
 *   Date:- 2024-02-12,
 *   Level:- Medium,
 *   Companies:- Uber:Apple:Adobe:Cisco:PayTM:Amazon:Google:Shopee:VMware:Oracle:Samsung:Infosys:LinkedIn:Facebook:JPMorgan:Docusign:Microsoft:Bloomberg:ByteDance:Salesforce:ServiceNow:Goldman Sachs:Walmart Global Tech,
 *   Notes:- No Notes Needed,
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
