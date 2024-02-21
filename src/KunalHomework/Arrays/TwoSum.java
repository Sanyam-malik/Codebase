package KunalHomework.Arrays;

import java.util.HashMap;
import java.util.Map;


/*
 * <metadata>
 *   Name:- Two Sum,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/two-sum,
 *   Date:- 2024-02-20,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
