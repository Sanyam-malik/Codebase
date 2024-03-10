package Kunal_Homework.Arrays;


/*
 * <metadata>
 *   Name:- Build Array from Permutation,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF80Ny5wbmc=&version_id=null">,
 *   Status:- Incomplete?,
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
