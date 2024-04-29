package Extra_Problems.Arrays;


/*
 * <metadata>
 * <name>Number of Good Pairs - Revision</name>
 * <description><img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF81My5wbmc=&version_id=null"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/number-of-good-pairs</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <remarks>Needs Algorithm Improvement</remarks>
 * <companies>Adobe:Amazon:Microsoft</companies>
 * <notes>Solution 1 - Nested Loops</notes>
 * <countinclusion>no</countinclusion>
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
