# Binary Search in Programming

Binary search is an efficient algorithm used to find the position of a target value within a sorted array. It works by repeatedly dividing the search interval in half until the target value is found or the interval is empty.

## Background

Binary search operates on the principle of divide and conquer, where the search space is divided into smaller parts and the target value is compared with the middle element of the array. Based on the comparison result, the search space is halved, narrowing down the possible locations of the target value.

## Normal Binary Search

Normal binary search operates on a sorted array and has the following steps:
1. Initialize two pointers, `left` and `right`, to the start and end of the array, respectively.
2. Repeat until `left` is less than or equal to `right`:
    - Calculate the middle index as `(left + right) / 2`.
    - If the middle element is equal to the target value, return its index.
    - If the middle element is greater than the target value, update `right = mid - 1`.
    - If the middle element is less than the target value, update `left = mid + 1`.
3. If the target value is not found, return -1.

### Example: Normal Binary Search

```java
public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearch(arr, target);
        System.out.println("Index of target element using normal binary search: " + result); // Output: Index of target element using normal binary search: 6
    }
}
```