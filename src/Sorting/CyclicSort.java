package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * <metadata>
 * <name>Cyclic Sort</name>
 * <status>Completed</status>
 * <url>https://wemakedevs.org</url>
 * <date>2024-03-18</date>
 * <level>Easy</level>
 * <notes>Find and swap the elements until each element is its in correct position</notes>
 * <remarks>Important Technique:</remarks>
 * </metadata>
 * */
public class CyclicSort {

    public static void main(String args[]) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int i = 0;
        while(i != arr.length) {
            if (arr[i] != i + 1) {  // Element is not in its correct position
                int correctIndex = arr[i] - 1;
                if (correctIndex < arr.length && arr[i] != arr[correctIndex]) {
                    // Swap the elements
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }

        }

        ArrayList<Integer> list = new ArrayList<>();
        for(i=0; i< arr.length; i++) {
            int elem = i+1;
            if(elem != arr[i]) {
               list.add(elem);
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
