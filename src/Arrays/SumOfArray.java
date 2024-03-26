package Arrays;

/*
 * <metadata>
 *   Name:- Sum of Array,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Sum_of_Array.png">,
 *   URL:- https://www.geeksforgeeks.org/problems/sum-of-array2326/1,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- Regular Loop,
 * </metadata>
 * */
public class SumOfArray {

    int sum(int arr[], int n) {
        int sum = 0;
        for(int i: arr) {
            sum+=i;
        }

        return sum;
    }

}
