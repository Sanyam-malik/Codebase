package Arrays;

/*
 * <metadata>
 *   Name:- Maximum Subarray,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF83NS5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/maximum-subarray/description/,
 *   Date:- 2024-03-12,
 *   Level:- Medium,
 *   Remarks:- Solve Using Divide and Conquer:LearnYard Problem,
 *   Notes:- Solution - Use Kadane's Algorithm,
 *   Companies:- Uber:Apple:Adobe:Cisco:PayTM:Amazon:Google:Shopee:VMware:Oracle:Samsung:Infosys:LinkedIn:Facebook:JPMorgan:Docusign:Microsoft:Bloomberg:ByteDance:Salesforce:ServiceNow:Goldman Sachs:Walmart Global Tech,
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
