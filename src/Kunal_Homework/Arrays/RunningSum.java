package Kunal_Homework.Arrays;

/*
 * <metadata>
 *   Name:- Running Sum of 1d Array,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF82Ni5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/running-sum-of-1d-array,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Microsoft,
 * </metadata>
 * */
public class RunningSum {

    public int[] runningSum(int[] nums) {
        for(int i=1; i< nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
