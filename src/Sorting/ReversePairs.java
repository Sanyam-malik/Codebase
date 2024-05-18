package Sorting;
import java.util.Arrays;


/*
 * <metadata>
 * <name>Reverse Pairs</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReversePairs.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/reverse-pairs/description/</url>
 * <date>2024-04-14</date>
 * <level>Hard</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/0e4bZaP3MDI?si=1K2WUp4Hyfg3iHlH" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <companies>Amazon</companies>
 * <remarks>:Good Question</remarks>
 * </metadata>
 * */
public class ReversePairs {

    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int nums[],int low,int high){
        int count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid + 1, high);
            count += merge(nums, low, mid, high);
        }
        return count;
    }
    public static int merge(int []nums, int low,int mid,int high){
        int[] leftArray = Arrays.copyOfRange(nums, low, mid + 1);
        int[] rightArray = Arrays.copyOfRange(nums, mid + 1, high + 1);

        int i = 0, j = 0, k = low;
        int count = 0;

        /*
        *
        * This is the secret Sauce Here
        * */
        while (i < leftArray.length && j < rightArray.length) {
            if ((long) leftArray[i] > 2 * (long) rightArray[j]) {
                count += leftArray.length - i;
                j++;
            } else {
                i++;
            }
        }

        i = 0;
        j = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k++] = leftArray[i++];
            } else {
                nums[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            nums[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            nums[k++] = rightArray[j++];
        }

        return count;
    }



    // Brute Force Approach
    public static int bruteForce(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j< nums.length; j++) {
                long e1 = nums[i];
                long e2 = 2L *nums[j];
                if(e1 > e2)  {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(reversePairs(new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647}));
    }
}
