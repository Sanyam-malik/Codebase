# Sliding Window

The sliding window algorithm is used for finding the optimal solution of various problems that involve arrays or strings.

## Implementation

It works by maintaining a window of elements within the array or string and adjusting the window size based on certain conditions.

```java
public class SlidingWindow {
    public static int maxSum(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println("Maximum sum in sliding window of size " + k + ": " + maxSum(arr, k));
    }
}
