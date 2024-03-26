package Kunal_Homework.Arrays;



/*
 * <metadata>
 *   Name:- Remove Duplicates from Sorted Array,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Remove_Array_Duplicates.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/remove-duplicates-from-sorted-array/,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Adobe:Apple:Amazon:Google:VMware:Facebook:LinkedIn:Microsoft:Bloomberg,
 * </metadata>
 * */
public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
