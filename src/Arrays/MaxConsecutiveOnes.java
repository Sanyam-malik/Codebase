package Arrays;
/*
 * <metadata>
 * <name>Max Consecutive Ones</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Max_Consecutive_Ones.png"></description>
 * <url>https://leetcode.com/problems/max-consecutive-ones</url>
 * <date>2024-02-12</date>
 * <level>Easy</level>
 * <remarks>LearnYard Problem</remarks>
 * <notes>Solution - Have two variables max and count when number is changed compare max with count and save new max and make count = 0</notes>
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
