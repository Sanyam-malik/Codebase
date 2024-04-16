package Sorting;
import java.util.*;



/*
 * <metadata>
 *   Name:- Sum in a Matrix,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/SumInMatrix.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/sum-in-a-matrix/description/,
 *   Date:- 2024-04-15,
 *   Level:- Medium,
 *   Notes:- Just sort matrix rowwise and normal for loop to find maximum and adding it to score,
 *   Remarks:- LearnYard Problem:Good Question,
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
