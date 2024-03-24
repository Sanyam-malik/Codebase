package Arrays;


/*
 * <metadata>
 *   Name:- Smallest Range I,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Smallest_Range_I.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/smallest-range-i/,
 *   Date:- 2024-03-24,
 *   Level:- Easy,
 *   Notes:- Find the min and max element and check if min+k >= max-k return 0 else (max-k)-(min+k),
 *   Remark:- LearnYard Problem:Good Question,
 *   Companies:- Adobe
 * </metadata>
 * */
public class SmallestRangeI {

    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];

        for(int num: nums) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        if(min+k >= max-k) {
            return 0;
        } else {
            return (max-k) - (min+k);
        }
    }

}
