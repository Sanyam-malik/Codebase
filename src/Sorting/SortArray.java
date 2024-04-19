package Sorting;
import java.util.Arrays;
/*
 * <metadata>
 * <name>Sort an Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/SortArray.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/sort-an-array/description/</url>
 * <date>2024-04-11</date>
 * <level>Medium</level>
 * <notes>Just Use Arrays.sort() or Merge Sort (Quick Sort will work but will be slow because of edge cases)</notes>
 * <remarks>LearnYard Problem</remarks>
 * <companies>Amazon:Bloomberg</companies>
 * </metadata>
 * */
public class SortArray {
        public int[] sortArray(int[] nums) {
            return sort(nums);
        }

        public static int[] sort(int[] arr){
            int n = arr.length;
            if(n == 1) return arr;
            int[] arr1 = sort(Arrays.copyOfRange(arr, 0, n/2));
            int[] arr2 = sort(Arrays.copyOfRange(arr, n/2, n));
            return merge2Sorted(arr1, arr2);
        }

        public static int[] merge2Sorted(int[] arr1, int[] arr2) {
            int[] result = new int[arr1.length+ arr2.length];
            int index = 0;
            int idx1 = 0;
            int idx2 = 0;
            while(idx1 < arr1.length && idx2 < arr2.length) {
                if(arr1[idx1] <= arr2[idx2]) {
                    result[index++] = arr1[idx1++];
                } else {
                    result[index++] = arr2[idx2++];
                }
            }

            while (idx1 < arr1.length) {
                result[index++] = arr1[idx1++];
            }

            while (idx2 < arr2.length) {
                result[index++] = arr2[idx2++];
            }

            return result;
        }
}
