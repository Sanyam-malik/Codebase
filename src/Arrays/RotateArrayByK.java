package Arrays;
import java.util.*;

/*
 * <metadata>
 *   Name:- Rotate Array,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Rotate_Array.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/rotate-array/description/,
 *   Date:- 2024-03-13,
 *   Level:- Medium,
 *   Companies:- TCS:Yahoo:Amazon:Google:Facebook:Microsoft:Salesforce,
 *   Notes:- Solution 1 - New Array and Iterate from n-k-1 to end -> then iterate from start to k -> Saving the result </br>
 *          Solution 2 - Reverse the whole array -> reverse the elements upto k -> reverse from k+1 to end,
 *   Remarks:- LearnYard Problem:Needs Revision of Concept
 * </metadata>
 * */
public class RotateArrayByK {

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

}
