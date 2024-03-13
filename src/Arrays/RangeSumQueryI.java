package Arrays;



/*
 * <metadata>
 *   Name:- Range Sum Query - Immutable,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF83OS5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/range-sum-query-immutable/description/,
 *   Date:- 2024-03-13,
 *   Level:- Easy,
 *   Companies:- Facebook,
 *   Notes:- Make a Prefix Array and use it wisely,
 *   Remarks:- LearnYard Problem
 * </metadata>
 * */
public class RangeSumQueryI {

    int[] prefixNums;

    public RangeSumQueryI(int[] nums) {
        this.prefixNums = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            this.prefixNums[i] = (i == 0 ? nums[i] : nums[i] + this.prefixNums[i-1]);
        }
    }

    public int sumRange(int left, int right) {
        if(left == 0) {
            return this.prefixNums[right];
        } else {
            return prefixNums[right] - prefixNums[left -1];
        }
    }


}
