package Arrays;
import java.util.*;


/*
 * <metadata>
 * <name>Count Pairs Whose Sum is Less than Target</name>
 * <description>Given a 0-indexed integer array nums of length n and an integer target return the number of pairs (i j) where 0 <= i < j < n and nums[i] + nums[j] < target.</br></br>     <img src="http://lordmaximus.duckdns.org:9000/codebase/CountPairsSumTarget.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target</url>
 * <date>2024-02-27</date>
 * <level>Easy</level>
 * <notes>Solution 1 Hint - Two for Loops? </br></br> Solution 2 Hint - Sort and iterate once using two pointers (N Log N)?</notes>
 * </metadata>
 * */
public class CountNoFairPairs {

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        while(left < right) {
            int sum = nums.get(left)+nums.get(right);
            if(sum < target) {
                count+=right-left;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

}
