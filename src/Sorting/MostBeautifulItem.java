package Sorting;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Most Beautiful Item for Each Query</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MostBeautifulItem.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/most-beautiful-item-for-each-query/description/</url>
 * <date>2024-04-14</date>
 * <level>Medium</level>
 * <notes>Sort According to Prices Create Prefix Max Array and Prices Array to Do the Binary Search</notes>
 * <companies>Postmates</companies>
 * <remarks>:Good Question</remarks>
 * </metadata>
 * */
public class MostBeautifulItem {

    public static int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        int[] prices = new int[items.length];
        int[] preMax = new int[items.length];

        for(int i=0; i< items.length; i++) {
            prices[i] = items[i][0];
            preMax[i] = i==0 ? items[i][1] : Math.max(preMax[i-1], items[i][1]);
        }

        int[] result = new int[queries.length];
        for(int j=0; j<queries.length; j++) {
            int price = queries[j];
            int index = findIndex(prices, price);
            if (index == -1) {
                result[j] = 0;
            } else {
                result[j] = preMax[index];
            }
        }
        return result;
    }

    public static int findIndex(int[] prices, int target) {
        int start = 0;
        int end = prices.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(prices[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return end;
    }

    public static void main(String args[]) {
        int[][] items = new int[][]{{10,1000}};
        int[] q= new int[]{5};
        System.out.println(Arrays.toString(maximumBeauty(items, q)));
    }
}
