package Extra_Problems.Arrays;



/*
 * <metadata>
 * <name>Remove Duplicates from Sorted Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Remove_Array_Duplicates.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/remove-duplicates-from-sorted-array/</url>
 * <date>2024-02-23</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Adobe:Apple:Amazon:Google:VMware:Facebook:LinkedIn:Microsoft:Bloomberg</companies>
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
