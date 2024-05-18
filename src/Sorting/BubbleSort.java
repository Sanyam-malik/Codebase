package Sorting;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Bubble Sort</name>
 * <status>Completed</status>
 * <url>https://wemakedevs.org</url>
 * <date>2024-03-18</date>
 * <level>Easy</level>
 * <notes>Use two loops Check at each iteration if next no is smaller then previous if it is swap them</notes>
 * <remarks>Important Technique:Implementations</remarks>
 * </metadata>
 * */
public class BubbleSort {

    public static void sort(int[] arr){
        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j< arr.length; j++) {
                if(arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{1, 4, 5, 2, 8, 9, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
