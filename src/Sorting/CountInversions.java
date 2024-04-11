package Sorting;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Count Inversions,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/CountInversions.png">,
 *   Status:- Attempted,
 *   URL:- https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1,
 *   Date:- 2024-04-11,
 *   Level:- Medium,
 *   Notes:- Global Variable to store the result and merge sort / quick sort,
 *   Remarks:- LearnYard Problem:Good Question,
 *   Companies:- Flipkart:Amazon:Microsoft:MakeMyTrip:Adobe:BankBazaar:Myntra,
 * </metadata>
 * */
public class CountInversions {

    static int inversions = 0;
    static long inversionCount(long arr[], long N) {
        int sort = checkIfSortedInAnyOrder(arr);
        // It is already sorted
        if(sort == 0) return 0;
        // It is descending sorted
        else if(sort == 1) return N;
        else {
            sort(arr);
        }
        return inversions;
    }

    public static long[] sort(long[] arr){
        int n = arr.length;
        if(n == 1) return arr;
        long[] arr1 = sort(Arrays.copyOfRange(arr, 0, n/2));
        long[] arr2 = sort(Arrays.copyOfRange(arr, n/2, n));
        return merge2Sorted(arr1, arr2);
    }

    public static long[] merge2Sorted(long[] arr1, long[] arr2) {
        long[] result = new long[arr1.length+ arr2.length];
        int index = 0;
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < arr1.length && idx2 < arr2.length) {
            if(arr1[idx1] <= arr2[idx2]) {
                result[index++] = arr1[idx1++];
            } else {
                result[index++] = arr2[idx2++];
                inversions++;
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

    static int checkIfSortedInAnyOrder(long arr[]) {
        int sort = -1;
        for(int i=0; i< arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
                sort = 0;
            } else {
                sort = -1;
            }
        }

        for(int i=0; i< arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                sort = 1;
            } else {
                sort = -1;
            }
        }
        return sort;
    }
}
