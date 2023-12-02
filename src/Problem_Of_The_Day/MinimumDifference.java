package Problem_Of_The_Day;
import java.util.*;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/minimum-difference-of-array_5026699,
 *   Date:- 2023-12-02
 * </metadata>
 * */
public class MinimumDifference {

    static int minDiff(int n, int[] arr) {
        Arrays.sort(arr);

        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;

        // Find the min diff by comparing adjacent
        // pairs in sorted array
        for (int i = 0; i < n - 1; i++)
            if (arr[i + 1] - arr[i] < diff)
                diff = arr[i + 1] - arr[i];

        // Return min diff
        return diff;

    }

    public static void main(String args[]) {
        System.out.println(minDiff(4, new int[]{1, 8, 3, 10}));
    }
}
