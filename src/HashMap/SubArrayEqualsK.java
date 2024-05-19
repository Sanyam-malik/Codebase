package HashMap;

import java.util.HashMap;
import java.util.Map;


/*
 * <metadata>
 * <name>Subarray Sum Equals K</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/SubArrayEqualsK.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/subarray-sum-equals-k/description/</url>
 * <date>2024-05-20</date>
 * <level>Medium</level>
 * <remarks>Good Question</remarks>
 * <companies>Visa:Bolt:Apple:Quora:Adobe:Amazon:Google:Oracle:tiktok:Nvidia:Expedia:Facebook:DoorDash:Microsoft:Bloomberg:ServiceNow</companies>
 * <notes>Use Prefix Sum and Hashmap</notes>
 * </metadata>
 * */
public class SubArrayEqualsK {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // To handle the case where the subarray starts from index 0
        int count = 0;
        int cumulativeSum = 0;

        for (int num : nums) {
            cumulativeSum += num;
            if (map.containsKey(cumulativeSum - k)) {
                count += map.get(cumulativeSum - k);
            }
            map.put(cumulativeSum, map.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }

    public static void main(String args[]) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
    }
}
