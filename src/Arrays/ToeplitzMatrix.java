package Arrays;



/*
 * <metadata>
 * <name>Toeplitz Matrix</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Toeplitz_Matrix.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/toeplitz-matrix</url>
 * <date>2024-02-28</date>
 * <level>Easy</level>
 * <notes>Two For Loops with A Catch</notes>
 * <companies>Facebook:Bloomberg</companies>
 * </metadata>
 * */
public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1; i< matrix.length; i++) {
            for(int j=1; j< matrix[i].length; j++) {
                if(matrix[i][j]!=matrix[i-1][j-1]) return false;
            }
        }
        return true;
    }


}
