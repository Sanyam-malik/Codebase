# Finding First and Last Occurrences using Modified Binary Search

This program demonstrates how to find the first and last occurrences of an element in a sorted array using modified binary search.

## Background

Finding the first and last occurrences of an element in a sorted array is a common problem in programming. Modified binary search offers an efficient solution by continuing the search even after finding a match, allowing us to locate both occurrences.

## Finding First Occurrence

To find the first occurrence of an element, the program performs a modified binary search where the search continues towards the left (by decreasing the `right` pointer) after finding a match.

## Finding Last Occurrence

Similarly, to find the last occurrence of an element, the program performs a modified binary search where the search continues towards the right (by increasing the `left` pointer) after finding a match.

## Usage

Ensure the array is sorted before using the program. Then, call the `findFirstOccurrence` and `findLastOccurrence` functions with the sorted array and the target element as parameters. These functions return the indices of the first and last occurrences of the target element, respectively.

### Example

```java
public class ModifiedBinarySearch {
    // Functions for finding first and last occurrences
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstOccurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1; // Continue searching towards left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstOccurrence;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastOccurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1; // Continue searching towards right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastOccurrence;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        int target = 5;
        
        int firstOccurrence = findFirstOccurrence(arr, target);
        System.out.println("First occurrence of " + target + " is at index " + firstOccurrence); // Output: First occurrence of 5 is at index 4
        
        int lastOccurrence = findLastOccurrence(arr, target);
        System.out.println("Last occurrence of " + target + " is at index " + lastOccurrence); // Output: Last occurrence of 5 is at index 6
    }
}
```