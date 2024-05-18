package Arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;



/*
 * <metadata>
 * <name>Number of Subarrays That Match a Pattern I</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Subarrays_That_Match_I.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/number-of-subarrays-that-match-a-pattern-i/description/</url>
 * <date>2024-03-24</date>
 * <level>Medium</level>
 * <notes>1. Brute Force Using For Loops </br> 2. Using KMP Algorithm</notes>
 * <remark>Good Question:Needs Practice of Related Problems</remark>
 * </metadata>
 * */
public class SubArraysThatMatchI {

    public static int countMatchingSubarraysBruteForce(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        int count = 0;
        for (int i = 0; i <= n - m -1; i++) {
            boolean validSubarray = true;
            for (int j = 0; j < m; j++) {
                if (pattern[j] == 1 && nums[i + j + 1] <= nums[i + j]) {
                    validSubarray = false;
                    break;
                } else if (pattern[j] == 0 && nums[i + j + 1] != nums[i + j]) {
                    validSubarray = false;
                    break;
                } else if (pattern[j] == -1 && nums[i + j + 1] >= nums[i + j]) {
                    validSubarray = false;
                    break;
                }
            }
            if (validSubarray) {
                count++;
            }
        }
        return count;
    }

    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
        List<Integer> p = Arrays.stream(pattern).boxed().collect(Collectors.toList());
        List<Integer> slide = new LinkedList<>();

        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                slide.add(1);
            } else if (nums[i - 1] > nums[i]) {
                slide.add(-1);
            } else {
                slide.add(0);
            }

            if(slide.equals(p)) ans++;

            if(slide.size() >= p.size()) {
                slide.remove(0);
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        System.out.println(countMatchingSubarrays(new int[]{1,2,3,4,5,6}, new int[]{1, 1}));
    }

}
