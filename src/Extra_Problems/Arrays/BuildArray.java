package Extra_Problems.Arrays;


/*
 * <metadata>
 * <name>Build Array from Permutation</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Build_Array_Permutation.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/build-array-from-permutation</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <companies>Uber:Apple:Adobe:Google</companies>
 * <notes>No Notes Needed</notes>
 * </metadata>
 * */
public class BuildArray {

     public int[] buildArray(int[] nums) {
         int[] temp = new int[nums.length];
         int k = 0;
         for(Integer i: nums){
            temp[k++] = nums[i];
         }
         return temp;
     }

}
