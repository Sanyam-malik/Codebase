package Arrays;


/*
 * <metadata>
 *   Name:- Count Sorted rows,
 *   Status:- Completed,
 *   Description:- Given two integers N and M and a matrix of dimensions N*M. Count all the rows in a matrix that are sorted either in strictly increasing order or in strictly decreasing order.
     </br></br><img src="http://lordmaximus.duckdns.org:9000/codebase/Count_Sorted_Rows.png">,
 *   URL:- https://www.geeksforgeeks.org/problems/count-sorted-rows2702/1,
 *   Date:- 2024-02-28,
 *   Level:- Easy,
 *   Companies:- Samsung,
 *   Notes:- Solution - Iterate for Rows and inside iterate for column and compare it to next element and set the incr and decr variables if the length of either of these is equal to column size then increse count else do nothing,
 * </metadata>
 * */
public class CountSortedRows {

    int sortedCount(int N, int M, int Mat[][]) {
        // code here

        int count = 0;
        for(int i=0;i<N;i++){

            int incr = 0;
            int decr = 0;

            for(int j=0;j<M-1;j++){
                if(Mat[i][j] > Mat[i][j+1]){
                    decr++;
                }
                if(Mat[i][j] < Mat[i][j+1]){
                    incr++;
                }
            }

            if(incr == M-1 || decr == M-1){
                count++;
            }

        }
        return count;
    }

}
