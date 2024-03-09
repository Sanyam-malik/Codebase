package Arrays;



/*
 * <metadata>
 *   Name:- Sum of elements in a matrix,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Companies:- Zoho,
 *   Notes:- No Notes,
 * </metadata>
 * */
public class SumElemMatrix {

    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum = 0;
        for(int r=0; r< N; r++) {
            for(int c=0; c< M; c++) {
                sum+=Grid[r][c];
            }
        }

        return sum;
    }

}
