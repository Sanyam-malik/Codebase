package Extra_Problems.Arrays;



/*
 * <metadata>
 * <name>Reshape the Matrix</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Reshape_Matrix.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/reshape-the-matrix</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Facebook:Bloomberg</companies>
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
