package Extra_Problems.Sorting;

/*
 * <metadata>
 * <name>Merge Sorted Array - Revision</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Merge_Sorted_Array.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>https://leetcode.com/problems/merge-sorted-array</url>
 * <date>2024-04-16</date>
 * <level>Easy</level>
 * <companies>Uber:Apple:Amazon:Shopee:Indeed:Oracle:Facebook:LinkedIn:Microsoft:Bloomberg</companies>
 * <notes>Compare and merge you could use a new array or use hint</notes>
 * <remarks>LearnYard Problem</remarks>
 * <countinclusion>no</countinclusion>
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
