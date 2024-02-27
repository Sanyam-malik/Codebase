package Arrays;
import java.util.*;


/*
 * <metadata>
 *   Name:- Count Pairs Whose Sum is Less than Target,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Notes:- No Notes,
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
