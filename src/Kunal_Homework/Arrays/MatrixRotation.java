package Kunal_Homework.Arrays;

import java.util.Arrays;


/*
 * <metadata>
 *   Name:- Determine Whether Matrix Can Be Obtained By Rotation,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/DetermineMatrixRotation.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation,
 *   Date:- 2024-02-21,
 *   Level:- Easy,
 *   Companies:- Adobe,
 *   Notes:- 1. Naive: To Rotate Matrix by 90 Transpose the matrix and Switch the Columns <br /> 2. Understand the Pattern,
 * </metadata>
 * */
public class MatrixRotation {

    public static boolean findRotationByDoingIt(int[][] mat, int[][] target) {
        int angleNo = 1;
        // Four Tries
        while (angleNo < 5) {
            int[][] rmat = rotateMatrix(mat, angleNo * 90);
            if (!compareMatrix(rmat, target)) {
                angleNo++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean findRotation(int[][] a, int[][] b) {
        int n=a.length;
        int c90=0,c180=0,c270=0,c0=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(b[i][j]==a[n-j-1][i])
                    c90++;
                if(b[i][j]==a[n-i-1][n-j-1])
                    c180++;
                if(b[i][j]==a[j][n-i-1])
                    c270++;
                if(b[i][j]==a[i][j])
                    c0++;
            }
        }
        
        if(c90==n*n||c270==n*n||c180==n*n||c0==n*n)
            return true;
        else 
            return false;
    }

    static int[][] rotateMatrix(int[][] mat, int angleRotate) {
        int rotations = angleRotate / 90;
        int[][] rotatedMat = copyMatrix(mat);

        while (rotations > 0) {
            // Transpose the matrix
            for (int i = 0; i < rotatedMat.length; i++) {
                for (int j = i + 1; j < rotatedMat[i].length; j++) {
                    int temp = rotatedMat[i][j];
                    rotatedMat[i][j] = rotatedMat[j][i];
                    rotatedMat[j][i] = temp;
                }
            }

            // Reverse each row
            for (int i = 0; i < rotatedMat.length; i++) {
                for (int j = 0; j < rotatedMat.length / 2; j++) {
                    int temp = rotatedMat[i][j];
                    rotatedMat[i][j] = rotatedMat[i][rotatedMat.length - 1 - j];
                    rotatedMat[i][rotatedMat.length - 1 - j] = temp;
                }
            }

            rotations--;
        }

        return rotatedMat;
    }

    static int[][] copyMatrix(int[][] mat) {
        int[][] copy = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            copy[i] = Arrays.copyOf(mat[i], mat[i].length);
        }
        return copy;
    }

    static boolean compareMatrix(int[][] rmat, int[][] target) {
        for (int r = 0; r < rmat.length; r++) {
            for (int c = 0; c < rmat[r].length; c++) {
                if (rmat[r][c] != target[r][c]) return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(findRotation(mat, target));
    }
}
