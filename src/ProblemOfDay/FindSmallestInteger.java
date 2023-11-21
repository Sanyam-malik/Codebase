package ProblemOfDay;

import java.util.*;

public class FindSmallestInteger {

    public static int findSmallestInteger(int[] arr) {
        int res = 1; // Initialize result

        // sort the input array
        Arrays.sort(arr);

        // Traverse the array and increment 'res' if arr[i] is
        // smaller than or equal to 'res'.
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > res){
                return res;
            }
            else{
                res+=arr[i];
            }
        }

        return res;
    }

    public static void main(String[] a) {
        System.out.println(findSmallestInteger(new int[]{1, 3}));
    }
}
