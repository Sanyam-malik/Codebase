package Kunal_Homework.Arrays;

import java.util.HashMap;
import java.util.Map;


/*
 * <metadata>
 *   Name:- Two Sum,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Two_Sum.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/two-sum,
 *   Date:- 2024-02-20,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- IBM:Uber:Zoho:Visa:Dell:Zoom:Adobe:Apple:Yahoo:Intel:Amazon:Google:Oracle:Paypal:Intuit:Zillow:Zomato:Spotify:Expedia:Samsung:Facebook:JPMorgan:Microsoft:Bloomberg:Accenture:Salesforce:Goldman Sachs:Morgan Stanley:American Express:Walmart Global Tech,
 * </metadata>
 * */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}
