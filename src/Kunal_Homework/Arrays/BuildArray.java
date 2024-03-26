package Kunal_Homework.Arrays;


/*
 * <metadata>
 *   Name:- Build Array from Permutation,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Build_Array_Permutation.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/build-array-from-permutation,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Companies:- Uber:Apple:Adobe:Google,
 *   Notes:- No Notes Needed,
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
