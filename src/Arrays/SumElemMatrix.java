package Arrays;



/*
 * <metadata>
 * <name>Sum of elements in a matrix</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Sum_of_Elements.png"></description>
 * <url>https://www.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1</url>
 * <date>2024-02-27</date>
 * <level>Easy</level>
 * <companies>Zoho</companies>
 * <notes>Regular 2 for loops</notes>
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
