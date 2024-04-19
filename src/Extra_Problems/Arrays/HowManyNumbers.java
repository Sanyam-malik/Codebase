package Extra_Problems.Arrays;


/*
 * <metadata>
 * <name>How Many Numbers Are Smaller Than the Current Number</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Numbers_Smaller_Current.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <remarks>Needs Algorithm Improvement</remarks>
 * <companies>Yahoo:Amazon</companies>
 * <notes>Solution1: Nested Loops</notes>
 * </metadata>
 * */
public class HowManyNumbers {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int temp[] = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            int sum = 0;
            for(int j=0; j<nums.length;j++) {
                if(nums[j] < nums[i]) {
                    sum++;
                }
            }
            temp[i] = sum;
        }
        return temp;
    }

}
