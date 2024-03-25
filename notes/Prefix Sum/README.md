# Prefix Sum

Prefix Sum is a technique used to solve certain problems by pre-computing some information about the array.

## Problem Type

This algorithm is used to solve problems where pre-computing prefix information can optimize certain operations.

## Implementation

It involves calculating prefix sums to optimize certain operations.

### Example

Suppose we have an array `arr = [1, 2, 3, 4, 5]`.

The prefix sums would be `[1, 3, 6, 10, 15]`.

### Java Implementation

```java
import java.util.Arrays;

public class PrefixSum {
    public static int[] calculatePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = calculatePrefixSum(arr);
        System.out.println("Prefix sum array: " + Arrays.toString(prefixSum));
    }
}
