package Sorting;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Insertion Sort,
 *   Status:- Completed,
 *   URL:- https://wemakedevs.org,
 *   Date:- 2024-03-18,
 *   Level:- Easy,
 *   Notes:- Divide the array into sorted and unsorted parts,
 *   Remarks:- Important Technique:LearnYard Problem,
 * </metadata>
 * */
public class InsertionSort {

    public static void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] arr = new int[]{1, 4, 5, 2, 8, 9, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
