package KunalHomework.Arrays;


/*
 * <metadata>
 *   Name:- Build Array from Permutation,
 *   Status:- Needs Improvement,
 *   URL:- https://leetcode.com/problems/build-array-from-permutation,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
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
