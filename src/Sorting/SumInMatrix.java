package Sorting;
import java.util.*;



/*
 * <metadata>
 * <name>Sum in a Matrix</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/SumInMatrix.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/sum-in-a-matrix/description/</url>
 * <date>2024-04-15</date>
 * <level>Medium</level>
 * <notes>Just sort matrix rowwise and normal for loop to find maximum and adding it to score</notes>
 * <remarks>:Good Question</remarks>
 * </metadata>
 * */
public class SumInMatrix {

    public int matrixSum(int[][] nums) {
        int score = 0;
        int n = nums.length;
        int m = nums[0].length;
        for(int[] a :nums)
        {
            Arrays.sort(a);
        }
        for(int i=0;i<m;i++)
        {
            int max = 0;
            for(int j=0;j<n;j++)
            {
                max = Math.max(max,nums[j][i]);
            }
            score+=max;
        }
        return score;
    }
}
