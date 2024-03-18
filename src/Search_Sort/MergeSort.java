package Search_Sort;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Merge Sort,
 *   Status:- Completed,
 *   URL:- https://wemakedevs.org,
 *   Date:- 2024-03-18,
 *   Level:- Easy,
 *   Notes:- Use the recursion to divide the array and sort the array each time,
 *   Remarks:- Important Technique:LearnYard Problem,
 * </metadata>
 * */
public class MergeSort {

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

    public static void main(String args[]) {
        int[] arr = new int[]{1, 4, 5, 2, 8, 9, 7};
        System.out.println(Arrays.toString(sort(arr)));
    }

}
