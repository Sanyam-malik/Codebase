# Dutch National Flag Algorithm

The Dutch National Flag algorithm, also known as the three-way partitioning, is a sorting algorithm designed to arrange an array of objects with three distinct keys into a specific order.

## Problem Type

This algorithm is used to solve problems related to sorting arrays with three distinct values.

## Implementation

It partitions the array into three sections: elements less than a given value, elements equal to the given value, and elements greater than the given value.

### Example

Suppose we have an array `arr = [0, 1, 2, 0, 1, 2, 1]` and we want to sort it using the Dutch National Flag algorithm.

The sorted array would be `[0, 0, 1, 1, 1, 2, 2]`.

### Java Implementation

```java
public class DutchFlagAlgorithm {
    public static void dutchFlagSort(int[] arr, int pivot) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] < pivot) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1};
        int pivot = 1;
        dutchFlagSort(arr, pivot);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
