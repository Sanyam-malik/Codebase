package Arrays;



/*
 * <metadata>
 * <name>Range Sum Query 2D - Immutable</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Range_Sum_Query2D(1).png"> </br> <img src="http://lordmaximus.duckdns.org:9000/codebase/Range_Sum_Query2D(2).png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/range-sum-query-2d-immutable/</url>
 * <date>2024-03-13</date>
 * <level>Medium</level>
 * <companies>Lyft:Amazon:Google:Samsung:Facebook</companies>
 * <notes>Solution 1 - For loops </br>           Solution 2 - Prefix sum Technique (Arrays -> Practice 5)</notes>
 * <remarks>Needs Revision of Concept</remarks>
 * </metadata>
 * */
public class RangeSumQuery2D {

    private int[][] pre;

    public RangeSumQuery2D(int[][] matrix) {
        pre = new int[matrix.length][matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if(r == 0 && c == 0)
                    pre[r][c] = matrix[r][c];
                else if(r == 0)
                    pre[r][c] = pre[r][c-1] + matrix[r][c];
                else if(c == 0)
                    pre[r][c] = pre[r-1][c] + matrix[r][c];
                else
                    pre[r][c] = pre[r-1][c] + pre[r][c-1] - pre[r-1][c-1] + matrix[r][c];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = pre[row2][col2];

        if(row1 > 0)
            ans -= pre[row1 - 1][col2];
        if(col1 > 0)
            ans -= pre[row2][col1-1];
        if(row1 > 0 && col1 > 0)
            ans += pre[row1-1][col1-1];

        return ans;
    }
}
