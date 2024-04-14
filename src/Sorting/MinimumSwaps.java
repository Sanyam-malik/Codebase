package Sorting;


import java.util.Arrays;
import java.util.HashMap;

/*
 * <metadata>
 *   Name:- Minimum Swaps to Sort,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumSwaps.png">,
 *   Status:- Try Again,
 *   URL:- https://www.geeksforgeeks.org/problems/minimum-swaps/1,
 *   Date:- 2024-04-14,
 *   Level:- Medium,
 *   Notes:- <iframe width="560" height="315" src="https://www.youtube.com/embed/02NwBUPr1uw?si=PXkdRJ1fj1Y8iPYQ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 *   Companies:- Amazon,
 *   Remarks:- LearnYard Problem:Good Question,
 * </metadata>
 * */
public class MinimumSwaps {
    public static int minSwaps(int original[]) {
        int[] sorted = Arrays.copyOf(original, original.length);
        Arrays.sort(sorted);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i< sorted.length; i++) {
            hashMap.put(sorted[i], i);
        }

        int ans = 0;
        for(int i=0; i< original.length; i++) {
            if(original[i] != sorted[i]) {
                swap(original, hashMap.get(original[i]), i);
                ans++;
            }
        }
        return ans;

    }

    public static void swap(int arr[], int old_index, int new_index) {
        int temp = arr[old_index];
        arr[old_index] = arr[new_index];
        arr[new_index] = temp;
    }

    public static void main(String args[]) {
        System.out.println(minSwaps(new int[]{10, 19, 6, 3, 5}));
    }
}
