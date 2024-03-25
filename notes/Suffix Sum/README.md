# Prefix Sum

Suffix-Sum is a technique used to solve certain problems by pre-computing some information about the array or string.

## Implementation

It involves calculating suffix sums/products to optimize certain operations.

```java
public class PrefixSuffix {
    public static int[] calculateSuffixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        suffixSum[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
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
