package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


/*
 * <metadata>
 * <name>Top K Frequent Elements</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/AppyBalloons.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/top-k-frequent-elements/description/</url>
 * <date>2024-05-31</date>
 * <level>Medium</level>
 * <notes>Use Hashmap + Priority Queue and one more thing order of result DOES NOT MATTER</notes>
 * <remarks>Good Question</remarks>
 * </metadata>
 * */
public class TopKFrequency {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for (int n : nums)
            numFrequencyMap.put(n, numFrequencyMap.getOrDefault(n, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> topKElements = new PriorityQueue<>(
                (e1, e2) -> e1.getValue() - e2.getValue());

        // Go through all numbers of the numFrequencyMap and push them into
        // topKElements, which will have
        // the top k frequent numbers. If the heap size is more than k, we remove the
        // smallest (top) number.
        for (Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            topKElements.add(entry);
            if (topKElements.size() > k) {
                topKElements.poll();
            }
        }

        // Create a list of top k numbers
        int[] topNumbers = new int[k];

        int i = 0;
        while (!topKElements.isEmpty()) {
            topNumbers[i] = topKElements.poll().getKey();
            i++;
        }

        return topNumbers;
    }

    public static void main(String args[]) {
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }
}
