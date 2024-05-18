package Sorting;


import java.util.Arrays;

/*
 * <metadata>
 * <name>Minimum Difference among K</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumDifferenceK.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/minimum-difference-among-k5805/1</url>
 * <date>2024-04-05</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Amazon</companies>
 * <remarks></remarks>
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
