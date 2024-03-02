package Arrays;

/*
 * <metadata>
 *   Name:- Rotate Image,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/rotate-image,
 *   Date:- 2024-02-21,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transposing the Matrix
        for(int i=0; i< n; i++) {
            for(int j=i; j< n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Rotating the Matrix
        for(int i =0 ;i< matrix.length; i++){
            for(int j =0; j<matrix.length / 2; j++){
                int temp = 0 ;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

}