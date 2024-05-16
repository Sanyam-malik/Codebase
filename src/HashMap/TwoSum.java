package HashMap;

import java.util.HashMap;
import java.util.Map;


/*
 * <metadata>
 * <name>Two Sum</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Two_Sum.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/two-sum</url>
 * <date>2024-05-16</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>IBM:Uber:Zoho:Visa:Dell:Zoom:Adobe:Apple:Yahoo:Intel:Amazon:Google:Oracle:Paypal:Intuit:Zillow:Zomato:Spotify:Expedia:Samsung:Facebook:JPMorgan:Microsoft:Bloomberg:Accenture:Salesforce:Goldman Sachs:Morgan Stanley:American Express:Walmart Global Tech</companies>
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
