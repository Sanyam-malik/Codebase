package Arrays;
/*
 * <metadata>
 *   Name:- Max Consecutive Ones,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/max-consecutive-ones,
 *   Date:- 2024-02-12,
 *   Level:- Easy,
 *   Notes:- No Notes,
 * </metadata>
 * */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevCount = 0;
        int count = 0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 0) {
                prevCount = Math.max(prevCount, count);
                count = 0;
            } else {
                count++;
            }
        }
        prevCount = Math.max(prevCount, count);
        return prevCount;

    }
}
