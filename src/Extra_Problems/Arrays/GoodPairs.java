package Extra_Problems.Arrays;


/*
 * <metadata>
 *   Name:- Number of Good Pairs - Revision,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF81My5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/number-of-good-pairs,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Remarks:- Needs Algorithm Improvement,
 *   Companies:- Adobe:Amazon:Microsoft,
 *   Notes:- Solution 1 - Nested Loops,
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
