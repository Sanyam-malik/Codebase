package Sorting;


import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Minimum Difference among K,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumDifferenceK.png">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/minimum-difference-among-k5805/1,
 *   Date:- 2024-04-05,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Amazon,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class MinimumDifferenceK {

    static long minDiff(long a[] ,int N,int K) {
        Arrays.sort(a);
        long min = Long.MAX_VALUE;
        for(int i=0, j=i+(K-1); j< N; i++, j++) {
            min = Math.min(min, a[j]-a[i]);
        }
        return min;
    }

    public static void main(String args[]) {
        System.out.println(minDiff(new long[]{10, 100, 300, 200, 1000, 20, 30}, 7, 3));
    }
}
