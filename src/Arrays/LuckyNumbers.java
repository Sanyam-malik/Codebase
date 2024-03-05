package Arrays;

import java.util.Collections;
import java.util.List;

/*
 * <metadata>
 *   Name:- Lucky Numbers in a Matrix,
 *  Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMTMtMzUtMTMucG5n&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/lucky-numbers-in-a-matrix,
 *   Date:- 2024-02-21,
 *   Level:- Easy,
 *   Notes:- Solution - First get index of the min element in column and find max element in row and compare them if they are same add it.,
 * </metadata>
 * */
public class LuckyNumbers {

    public static List<Integer> luckyNumbers (int[][] matrix) {
        int value = -1;
        for(int i=0;i< matrix.length; i++) {
            int minCIndex = 0;
            int minValue = Integer.MAX_VALUE;
            for(int j=0;j< matrix[i].length; j++) {
                if(minValue > matrix[i][j]) {
                    minValue = matrix[i][j];
                    minCIndex = j;
                }
            }

            if(isMaximumOfColumn(matrix, i, minCIndex)) {
                value = minValue;
            }

        }

        return value > -1 ? List.of(value): Collections.emptyList();
    }

    static boolean isMaximumOfColumn(int[][] matrix, int r, int c) {
        int elem = matrix[r][c];
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int row = 0; row< matrix.length; row++) {
            if(maxValue < matrix[row][c]) {
                maxValue = matrix[row][c];
                maxIndex = row;
            }
        }

        if(maxIndex == r) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int[][] mat = {{3,6},{7,1},{5,2},{4,8}};
        System.out.println(luckyNumbers(mat));
    }
}
