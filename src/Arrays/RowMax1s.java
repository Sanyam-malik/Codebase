package Arrays;


/*
 * <metadata>
 *   Name:- Row with max 1s,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Companies:- Amazon:Microsoft:Snapdeal,
 *   Notes:- No Notes,
 * </metadata>
 * */
public class RowMax1s {

    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int ans = 0;
        int index = -1;
        for(int row=0;row<arr.length;row++){
            int count = 0;
            for(int cols = 0;cols<arr[row].length;cols++){
                if(arr[row][cols]==1){
                    count++;
                }
            }
            if(ans<count){
                ans = count;
                index = row;
            }
        }
        return index;
    }

}
