package Searching;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Maximum Tastiness of Candy Basket</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MaximizeTastiness.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/maximum-tastiness-of-candy-basket/</url>
 * <date>2024-04-26</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/LfFjcmE165Y?si=Fxn1Ugjj-yNZSCEl" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>LearnYard Problem:Good Question</remarks>
 * <companies>PhonePe</companies>
 * </metadata>
 * */
public class MaximizeTastiness {

    public static int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : price) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int start = 1;
        int end = max - min + 1;
        int ans = -1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            int compute = computeCandies(mid, price, k);
            if(compute >= k){
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static int computeCandies(int difference, int[] price, int k) {
        int last = price[0], count = 1, i = 1;
        while ( i < price.length) {
            if (price[i] - last >= difference) {
                last = price[i]; count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(maximumTastiness(new int[]{13,5,1,8,21,2}, 3));
    }
}
