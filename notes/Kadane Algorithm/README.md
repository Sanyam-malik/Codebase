# Kadane's Algorithm

Kadane's Algorithm is used to find the maximum sum subarray within a given array of integers. It is efficient and has a time complexity of O(n).

## Implementation

The algorithm scans the array from left to right, maintaining the maximum sum subarray ending at each position. It then selects the maximum of these sums as the result.

```java
public class KadaneAlgorithm {
    public static int maxSubArraySum(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum sum of subarray: " + maxSubArraySum(arr));
    }
}
