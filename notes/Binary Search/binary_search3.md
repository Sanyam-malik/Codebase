# Order-Agnostic Binary Search

Order-agnostic binary search is a variation of the binary search algorithm that can be applied to both ascending and descending sorted arrays. It works by comparing the middle element with the target value and adjusting the search interval based on the comparison result.

## Background

In standard binary search, the array is assumed to be sorted in ascending order. However, in order-agnostic binary search, the array can be either ascending or descending. The algorithm adapts to the order of the array and performs the search accordingly.

## How It Works

The basic idea behind order-agnostic binary search remains the same as standard binary search. The difference lies in how the comparison is made with the middle element.

- If the array is ascending, the comparison is straightforward.
- If the array is descending, the comparison is reversed.

## Example

Here's an example of order-agnostic binary search:

```java
public class OrderAgnosticBinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        boolean isAscending = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 4, 2, 0, -2, -4, -6, -8};
        int target = 0;
        int index = search(arr, target);
        System.out.println("Element " + target + " found at index " + index); // Output: Element 0 found at index 5
    }
}
```

### Applications

- Order-agnostic binary search is useful when the order of the array is not known beforehand or may vary. It is commonly used in scenarios where the array can be sorted in either ascending or descending order.
Complexity

 - The time complexity of order-agnostic binary search is O(log n), where n is the number of elements in the array. The space complexity is O(1).
Usage Guidelines

    - Ensure the array is sorted (either ascending or descending) before applying order-agnostic binary search.
    - Handle edge cases such as empty arrays or arrays with only one element