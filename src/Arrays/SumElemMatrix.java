package Arrays;



/*
 * <metadata>
 *   Name:- Sum of elements in a matrix,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8yMy5wbmc=&version_id=null">,
 *   URL:- https://www.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Companies:- Zoho,
 *   Notes:- Regular 2 for loops,
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
