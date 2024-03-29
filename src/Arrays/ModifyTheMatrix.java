package Arrays;


/*
 * <metadata>
 *   Name:- Modify the Matrix,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Modify_The_Matrix.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/modify-the-matrix/description/,
 *   Date:- 2024-03-24,
 *   Level:- Easy,
 *   Notes:- Calculate the max column of array each time and change value if the -1 is encountered.,
 *   Remark:- LearnYard Problem,
 * </metadata>
 * */
public class ModifyTheMatrix {

    public int[][] modifiedMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<col;i++) {

            int cmax=0;
            for(int j=0;j<row;j++) {
                cmax=Math.max(matrix[j][i],cmax);
            }

            for(int j=0;j<row;j++){
                if(matrix[j][i]==-1){
                    matrix[j][i]=cmax;
                }
            }
        }
        return matrix;
    }

}
