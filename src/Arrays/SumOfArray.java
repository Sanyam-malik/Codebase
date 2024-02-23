package Arrays;

/*
 * <metadata>
 *   Name:- Sum of Array,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/sum-of-array2326,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
