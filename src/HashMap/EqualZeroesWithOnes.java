package HashMap;

import java.util.HashMap;
import java.util.Map;


/*
 * <metadata>
 * <name>Subarrays with equal 1s and 0s</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/EqualZeroesWithOnes.png"></description>
 * <status>Try Again</status>
 * <url>https://www.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1</url>
 * <date>2024-05-16</date>
 * <level>Medium</level>
 * <notes>No Notes Needed</notes>
 * </metadata>
 * */
public class EqualZeroesWithOnes {

    public static int countSubarrWithEqualZeroAndOne(int arr[], int n){
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Initialize with prefix sum 0 with count 1
        int count = 0;

        for (int num : arr) {
            // Replace 0 with -1 and 1 with 1
            num = (num == 0) ? -1 : 1;
            prefixSum += num;
            if (prefixSumCount.containsKey(prefixSum)) {
                count += prefixSumCount.get(prefixSum);
                prefixSumCount.put(prefixSum, prefixSumCount.get(prefixSum) + 1);
            } else {
                prefixSumCount.put(prefixSum, 1);
            }
        }

        return count;
    }
}
