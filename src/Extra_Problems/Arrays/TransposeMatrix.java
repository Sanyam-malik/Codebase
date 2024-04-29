package Extra_Problems.Arrays;

/*
 * <metadata>
 * <name>Transpose Matrix - Revision</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Transpose_Matrix.png"></description>
 * <url>https://leetcode.com/problems/transpose-matrix</url>
 * <date>2024-02-20</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Apple:Amazon:Citadel:Microsoft</companies>
 * <countinclusion>no</countinclusion>
 * </metadata>
 * */
public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int arr[][]=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                arr[i][j]=matrix[j][i];
            }
        }
        return arr;
    }
}
