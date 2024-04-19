package Arrays;



/*
 * <metadata>
 * <name>Special Positions in a Binary Matrix</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/SpecialPositionsBinaryMatrix.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/special-positions-in-a-binary-matrix</url>
 * <date>2024-02-27</date>
 * <level>Easy</level>
 * <notes>Calculate Row Sum</notes>
 * <companies>Google:Uber:Bloomberg</companies>
 * </metadata>
 * */
public class SpecialPositions {

    public int numSpecial(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int rowSum[] = new int[rows], colSum[] = new int[cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                rowSum[r] += mat[r][c];
            }
        }

        for(int c = 0; c < cols; c++){
            for(int r = 0; r < rows; r++){
                colSum[c] += mat[r][c];
            }
        }
        int s = 0;
        for(int r = 0; r<rows; r++){
            for(int c = 0; c < cols; c++){
                if(mat[r][c] == 1 && rowSum[r] == 1 && colSum[c] == 1)s++;
            }
        }
        return s;
    }

}
