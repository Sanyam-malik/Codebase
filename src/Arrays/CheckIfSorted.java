package Arrays;


/*
 * <metadata>
 *   Name:- Check if array is sorted,
 *   Description:- Given an array arr[] of size N check if it is sorted in non-decreasing order or not.</br></br>
 *      <img src="http://lordmaximus.duckdns.org:9000/codebase/Check_If_Sorted.png">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- By Comparing the previous element with current element we can check if the flow is ok or not.,
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
