package Arrays;
/*
 * <metadata>
 *   Name:- Max Consecutive Ones,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMTQtMjMtNDgucG5n&version_id=null">,
 *   URL:- https://leetcode.com/problems/max-consecutive-ones,
 *   Date:- 2024-02-12,
 *   Level:- Easy,
 *   Remarks:- LearnYard Problem,
 *   Notes:- Solution - Have two variables max and count when number is changed compare max with count and save new max and make count = 0,
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
