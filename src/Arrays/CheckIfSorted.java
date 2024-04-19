package Arrays;


/*
 * <metadata>
 * <name>Check if array is sorted</name>
 * <description>Given an array arr[] of size N check if it is sorted in non-decreasing order or not.</br></br>       <img src="http://lordmaximus.duckdns.org:9000/codebase/Check_If_Sorted.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1</url>
 * <date>2024-02-23</date>
 * <level>Easy</level>
 * <notes>By Comparing the previous element with current element we can check if the flow is ok or not.</notes>
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
