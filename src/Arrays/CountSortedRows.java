package Arrays;


/*
 * <metadata>
 *   Name:- Count Sorted rows,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/count-sorted-rows2702,
 *   Date:- 2024-02-28,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
