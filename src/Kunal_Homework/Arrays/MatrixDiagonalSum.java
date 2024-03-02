package Kunal_Homework.Arrays;

/*
 * <metadata>
 *   Name:- Matrix Diagonal Sum,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/matrix-diagonal-sum,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length, leftD = 0, rightD = 0;
        boolean isEven = n % 2 == 0;
        int middle = !isEven ? mat[n/2][n/2] : 0;

        for(int r = 0; r< n; r++) {
            leftD += mat[r][r];
        }

        for(int c = 0; c< n; c++) {
            int r = n-1-c;
            rightD += mat[r][c];
        }

        return isEven ? leftD+rightD : leftD+rightD - middle;
    }

    public static void main(String args[]) {
        System.out.println(diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));
    }
}
