# Sliding Window

The sliding window algorithm is used for finding the optimal solution of various problems that involve arrays or strings.

## Problem Type

This algorithm is used to solve problems where a solution needs to be found within a fixed-size window of elements.

## Implementation

It works by maintaining a window of elements within the array or string and adjusting the window size based on certain conditions.

### Example

Suppose we have an array `arr = [1, 3, -1, -3, 5, 3, 6, 7]` and a window size of `3`.

The maximum values in each sliding window are `[3, 3, 5, 5, 6, 7]`.

### Java Implementation

```java
public class SlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // Remove elements outside the window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            // Remove elements smaller than the current element
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            
            // Add the current element to the deque
            deque.offer(i);
            
            // Add the maximum element of the current window to the result
            if (i - k + 1 >= 0) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(arr, k);
        System.out.println("Maximum values in sliding windows of size " + k + ": " + Arrays.toString(result));
    }
}
