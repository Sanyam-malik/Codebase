package Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 *   Status: Partially Completed,
 *   URL: https://www.codingninjas.com/studio/problems/subarray-with-distinct-integers_893062,
 *   Notes: Optimization Required
 * </metadata>
 * */
public class SubarrayDistinctIntegers {

    public static int goodSubarrays(int arr[], int n,int b) {
        if(n == 1 && b == 1) {
            return 1;
        }
        int count = 0;
        int slidingWindow = b;
        while(slidingWindow<=n) {
            for(int first = 0; first < n; first++) {
                int last = first + slidingWindow;
                if(last <= n) {
                    count += checkDistinctNo(arr, first, last, b) ? 1: 0;
                }
            }
            slidingWindow++;
        }
        return count;

    }

    static boolean checkDistinctNo(int[] arr, int f, int last, int b) {
        Set<Integer> set = new HashSet<Integer>();
        for(int j=f; j<last;j++) {
            set.add(arr[j]);
        }

        boolean result = set.size() == b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(goodSubarrays(new int[]{1, 2, 3, 4, 5, 6}, 6, 6));
    }
}
