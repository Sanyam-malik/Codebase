package Arrays;

/*
 * <metadata>
 *   Name:- Transpose Matrix,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8yNy5wbmc=&version_id=null">,
 *   URL:- https://leetcode.com/problems/transpose-matrix,
 *   Date:- 2024-02-20,
 *   Level:- Easy,
 *   Notes:- Row to Column Column to Row elements make sure you use new array when row and column are of diff size,
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
