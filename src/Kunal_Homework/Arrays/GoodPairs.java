package Kunal_Homework.Arrays;


/*
 * <metadata>
 *   Name:- Number of Good Pairs,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF81My5wbmc=&version_id=null">,
 *   Status:- Needs Improvement,
 *   URL:- https://leetcode.com/problems/number-of-good-pairs,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Companies:- Adobe:Amazon:Microsoft,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for(int i=0; i< nums.length; i++) {
            for(int j=i+1; j< nums.length; j++) {
                if(nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }

}
