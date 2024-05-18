package Sorting;

/*
 * <metadata>
 * <name>Sum of Absolute Differences in a Sorted Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/SumAbsoluteDifferences.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/description/</url>
 * <date>2024-04-07</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/kJdKcg4eUvM?si=47bcXQOaqtczbUz8" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <companies>Adobe</companies>
 * <remarks>Good Question</remarks>
 * </metadata>
 * */
public class SumAbsoluteDifferences {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] pref = new int[nums.length];
        int[] suf = new int[nums.length];

        // Calculation the Prefix and Suffix Sum of the given Array
        pref[0] = nums[0];
        suf[nums.length-1] = nums[nums.length-1];
        for(int i=1; i<nums.length; i++){
            pref[i] = pref[i-1] + nums[i];
            suf[nums.length-i-1] = suf[nums.length-i] + nums[nums.length-i-1];
        }


        // Calculation the AbsDiff of the Arrays
        int[]res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int absDiff = ((nums[i]*i)-pref[i]) + (suf[i]-(nums[i]*(nums.length-i-1)));
            res[i] = absDiff;
        }

        return res;
    }
}
