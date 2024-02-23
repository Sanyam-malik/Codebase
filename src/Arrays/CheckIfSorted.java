package Arrays;


/*
 * <metadata>
 *   Name:- Check if array is sorted,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class CheckIfSorted {

    boolean arraySortedOrNot(int[] arr, int n) {
        int prevElem = arr[0];
        for(int i =1; i< n; i++) {
            if(prevElem > arr[i]) return false;
            prevElem = arr[i];
        }
        return true;
    }

}
