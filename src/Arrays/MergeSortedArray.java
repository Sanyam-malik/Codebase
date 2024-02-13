package Arrays;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Merge Sorted Array,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/merge-sorted-array,
 *   Date:- 2024-02-12,
 *   Notes: No Notes
 * </metadata>
 * */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1; // Index to fill in the merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
