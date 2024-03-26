package Kunal_Homework.Arrays;

/*
 * <metadata>
 *   Name:- Transpose Matrix,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Transpose_Matrix.png">,
 *   URL:- https://leetcode.com/problems/transpose-matrix,
 *   Date:- 2024-02-20,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Apple:Amazon:Citadel:Microsoft,
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
