package Arrays;



/*
 * <metadata>
 *   Name:- Toeplitz Matrix,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/toeplitz-matrix,
 *   Date:- 2024-02-28,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
