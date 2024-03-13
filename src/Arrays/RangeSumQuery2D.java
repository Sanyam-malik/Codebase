package Arrays;



/*
 * <metadata>
 *   Name:- Range Sum Query 2D - Immutable,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF84Mi5wbmc=&version_id=null"> </br> <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF84My5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/range-sum-query-2d-immutable/,
 *   Date:- 2024-03-13,
 *   Level:- Medium,
 *   Companies:- Lyft:Amazon:Google:Samsung:Facebook,
 *   Notes:- Solution 1 - For loops </br>
 *          Solution 2 - Prefix sum Technique (Arrays -> Practice 5),
 *   Remarks:- LearnYard Problem:Needs Revision of Concept
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
