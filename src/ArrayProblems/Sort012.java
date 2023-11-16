package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort012 {

    // Dutch Flag Method
    public static void sort012(int[] arr){
        int low = 0, mid = 0;
        int high = arr.length - 1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else if(arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] a) {
        int[] arr = new int[]{0, 1, 1, 0, 0 ,1, 1 ,0, 1, 0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
