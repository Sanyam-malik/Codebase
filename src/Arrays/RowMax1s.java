package Arrays;


/*
 * <metadata>
 * <name>Row with max 1s</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Row_with_Max1s.png"></description>
 * <url>https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1</url>
 * <date>2024-02-27</date>
 * <level>Medium</level>
 * <companies>Amazon:Microsoft:Snapdeal</companies>
 * <notes>Regular 2 For Loop</notes>
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
