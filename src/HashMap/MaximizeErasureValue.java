package HashMap;


import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Maximum Erasure Value</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MaximumErasureValue.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-erasure-value/description/</url>
 * <date>2024-05-19</date>
 * <level>Medium</level>
 * <remarks>Good Question</remarks>
 * <companies>Cashfree</companies>
 * <notes>Same as <a href="http://lordmaximus.duckdns.org:4500/problem/statement/longest-substring-without-repeating-characters">Longest Substring Without Repeating Characters</a></notes>
 * </metadata>
 * */
public class MaximizeErasureValue {

    public static int maximumUniqueSubarray(int[] nums) {
        int maxLen = 0;
        int runningSum = 0;
        Set<Integer> set = new HashSet<>();
        int left  = 0;
        for(int right = 0; right < nums.length; right++) {
            while(set.contains(nums[right])) {
                runningSum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            runningSum+=nums[right];
            maxLen = Math.max(maxLen, runningSum);
        }
        return maxLen;
    }

    public static void main(String args[]) {
        System.out.println(maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }
}
