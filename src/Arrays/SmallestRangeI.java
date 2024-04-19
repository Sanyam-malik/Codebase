package Arrays;


/*
 * <metadata>
 * <name>Smallest Range I</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Smallest_Range_I.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/smallest-range-i/</url>
 * <date>2024-03-24</date>
 * <level>Easy</level>
 * <notes>Find the min and max element and check if min+k >= max-k return 0 else (max-k)-(min+k)</notes>
 * <remark>LearnYard Problem:Good Question</remark>
 * <companies>Adobe</companies>
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
