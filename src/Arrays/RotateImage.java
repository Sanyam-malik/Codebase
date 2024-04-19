package Arrays;

/*
 * <metadata>
 * <name>Rotate Image</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Rotate_Image.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/rotate-image</url>
 * <date>2024-02-21</date>
 * <companies>Uber:Cisco:Apple:Adobe:Amazon:Google:Rubrik:Facebook:Microsoft:Bloomberg</companies>
 * <level>Easy</level>
 * <notes>Transpose the Matrix and Switch Columns for 90 degree if more than that divide degree by 90 and repeat this n times</notes>
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
