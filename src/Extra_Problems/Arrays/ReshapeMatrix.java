package Extra_Problems.Arrays;



/*
 * <metadata>
 *   Name:- Reshape the Matrix,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Reshape_Matrix.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/reshape-the-matrix,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Facebook:Bloomberg,
 * </metadata>
 * */
public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c != m*n) {
            return mat;
        }

        int[][] reshape = new int[r][c];
        int sr = 0, sc = 0;
        for(int i=0; i< mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                reshape[sr][sc++] = mat[i][j];

                if(sc == c) {
                    sc = 0;
                    sr++;
                }
            }
        }

        return reshape;
    }
}
