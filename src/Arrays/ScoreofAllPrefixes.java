package Arrays;

import java.util.Arrays;


/*
 * <metadata>
 *   Name:- Find the Score of All Prefixes of an Array,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8xNi5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/,
 *   Date:- 2024-03-08,
 *   Level:- Medium,
 *   Notes:- Two arrays one will save the running max and one result array which will have prefix sum + previous sum added in result array,
 * </metadata>
 * */
public class ScoreofAllPrefixes {

    public static long[] findPrefixScore(int[] nums) {
        int[] maxUntil = new int[nums.length];
        long[] result = new long[nums.length];
        int runningMax = 0;
        for(int i=0; i< nums.length; i++) {
            runningMax=Math.max(runningMax, nums[i]);
            maxUntil[i] = runningMax;
        }

        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                result[i] = nums[i] + maxUntil[i];
            } else {
                result[i] = nums[i] + maxUntil[i] + result[i-1];
            }
        }

        return result;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(findPrefixScore(new int[]{2,3,7,5,10})));
    }

}
