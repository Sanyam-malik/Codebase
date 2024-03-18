package Search_Sort;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Selection Sort,
 *   Status:- Completed,
 *   URL:- https://wemakedevs.org,
 *   Date:- 2024-03-18,
 *   Level:- Easy,
 *   Notes:- Use two loops get the index with the smallest no and swap if the min index != current index,
 *   Remarks:- Important Technique:LearnYard Problem,
 * </metadata>
 * */
public class SelectionSort {

    public static void sort(int[] arr){
        for(int i=0; i< arr.length; i++) {
            int minIndex = i;
            for(int j=i+1; j< arr.length; j++) {
                if(arr[j] < arr[i]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                swap(arr, i, minIndex);
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
