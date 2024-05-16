package HashMap;

import java.util.HashMap;
import java.util.Map;


/*
 * <metadata>
 * <name>Zero Sum Subarrays</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ZeroSumSubArray.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/zero-sum-subarrays1825/1</url>
 * <date>2024-05-16</date>
 * <level>Medium</level>
 * <companies>Amazon:Microsoft:OYO Rooms</companies>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/HJWiQP5Kl-Q?si=F8J3ORrgRhMQOwBl" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * </metadata>
 * */
public class ZeroSumSubarray {

    public static long findSubarray(long[] arr ,int n) {
        long prefixSum = 0; // Initialize the prefix sum
        Map<Long, Integer> prefixSumCount = new HashMap<>(); // Map to store prefix sums and their counts
        prefixSumCount.put(0L, 1); // Initialize with prefix sum 0 and count 1
        long count = 0; // Initialize the count of sub-arrays with sum 0

        // Traverse the array and update the prefix sum
        for (long num : arr) {
            prefixSum += num; // Update the prefix sum
            // If the prefix sum exists in the map, increment the count by the corresponding value
            if (prefixSumCount.containsKey(prefixSum)) {
                count += prefixSumCount.get(prefixSum);
                // Increment the count of the current prefix sum
                prefixSumCount.put(prefixSum, prefixSumCount.get(prefixSum) + 1);
            } else {
                // If the prefix sum doesn't exist, add it to the map with count 1
                prefixSumCount.put(prefixSum, 1);
            }
        }

        return count; // Return the total count of sub-arrays with sum equal to 0
    }

    public static void main(String args[]) {
        System.out.println(findSubarray(new long[]{6,-1,-3,4,-2,2,4,6,-12,-7}, 0));
    }
}
