package Arrays;

/*
 * <metadata>
 *   Name:- Rotate Image,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMjItNTgtMjIucG5n&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/rotate-image,
 *   Date:- 2024-02-21,
 *   Companies:- Uber:Cisco:Apple:Adobe:Amazon:Google:Rubrik:Facebook:Microsoft:Bloomberg,
 *   Level:- Easy,
 *   Notes:- Transpose the Matrix and Switch Columns for 90 degree if more than that divide degree by 90 and repeat this n times,
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
