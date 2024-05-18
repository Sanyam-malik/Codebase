package Sorting;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * <metadata>
 * <name>Quick Sort</name>
 * <status>Completed</status>
 * <url>https://wemakedevs.org</url>
 * <date>2024-03-18</date>
 * <level>Easy</level>
 * <notes>Select the pivot</notes>
 * <remarks>Important Technique:</remarks>
 * </metadata>
 * */
public class QuickSort {

    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int l, int r)
    {
        if(l >= r) // either 1 element or no elements
            return;

        int id = partition(arr, l, r);

        quickSort(arr, l, id - 1); // Left part to be sorted
        quickSort(arr, id + 1, r); // Right part to be sorted
    }
    static int partition(int arr[], int l, int r) {
        /* Take an element as a pivot:
            1. Place the pivot element in its right place - id.
            2. Place all the elements <= pivot to its left.
            3. Place all the elements > right to its right.
            4. return id.
        */

        // Selecting a random pivot and Taking index r as the pivot.
        int pivot_id = l + (int) (Math.random() * (r - l + 1));

        int temp = arr[pivot_id];
        arr[pivot_id] = arr[r];
        arr[r] = temp;

        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();

        int pivotElement = arr[r];

        for(int i = l; i < r; ++i) {
            if(arr[i] <= pivotElement)
                smaller.add(arr[i]);
            else
                larger.add(arr[i]);
        }

        // Put back the elements correctly to the `arr`
        int id = l;
        for(int i = 0; i < smaller.size(); ++i) {
            arr[id++] = smaller.get(i);
        }

        arr[id] = pivotElement;
        int pivotIndex = id;
        id++;

        for(int i = 0; i < larger.size(); ++i) {
            arr[id++] = larger.get(i);
        }

        return pivotIndex;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{1, 4, 5, 2, 8, 9, 7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
