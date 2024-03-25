# Running Sum

The running sum algorithm is used to compute the cumulative sum of elements in an array.

## Implementation

It iterates through the array, adding each element to the running sum.

```java
public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] runningSumArr = runningSum(arr);
        System.out.println("Running sum array: " + Arrays.toString(runningSumArr));
    }
}
