package ArrayProblems;

public class MaximumSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        long result = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0; i< arr.length; i++) {
           sum += arr[i];
           if(sum > result) {
               result = sum;
           }
           if(sum < 0) {
               sum=0;
           }

        }
        return result;
    }

    public static void main(String[] a) {
        System.out.println("");
    }
}
