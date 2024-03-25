# Suffix Sum

Suffix Sum is a technique used to solve certain problems by pre-computing some information about the array.

## Problem Type

This algorithm is used to solve problems where pre-computing suffix information can optimize certain operations.

## Implementation

It involves calculating suffix sums to optimize certain operations.

### Example

Suppose we have an array `arr = [1, 2, 3, 4, 5]`.

The suffix sums would be `[15, 14, 12, 9, 5]`.

### Java Implementation

```java
import java.util.Arrays;

public class SuffixSum {
    public static int[] calculateSuffixSum(int[] arr) {
        int n = arr.length;
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        return suffixSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] suffixSum = calculateSuffixSum(arr);
        System.out.println("Suffix sum array: " + Arrays.toString(suffixSum));
    }
}
