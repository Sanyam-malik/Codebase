package Arrays;
import java.util.*;


/*
 * <metadata>
 *   Name:- Count Pairs Whose Sum is Less than Target,
 *   Description:- Given a 0-indexed integer array nums of length n and an integer target return the number of pairs (i j) where 0 <= i < j < n and nums[i] + nums[j] < target.</br></br>
     <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMDItMTAtMTAucG5n&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Notes:- Solution 1 Hint - Two for Loops? </br></br> Solution 2 Hint - Sort and iterate once using two pointers (N Log N)?,
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
