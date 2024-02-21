package KunalHomework.Arrays;

import java.util.Arrays;


/*
 * <metadata>
 *   Name:- Determine Whether Matrix Can Be Obtained By Rotation,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation,
 *   Date:- 2024-02-21,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class MatrixRotation {

    public static boolean findRotation(int[][] mat, int[][] target) {
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
