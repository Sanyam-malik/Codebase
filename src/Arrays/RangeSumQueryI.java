package Arrays;



/*
 * <metadata>
 * <name>Range Sum Query - Immutable</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Range_Sum_Query.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/range-sum-query-immutable/description/</url>
 * <date>2024-03-13</date>
 * <level>Easy</level>
 * <companies>Facebook</companies>
 * <notes>Make a Prefix Array and use it wisely</notes>
 * <remarks></remarks>
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
