package Searching;


/*
 * <metadata>
 *   Name:- Binary Search,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/BinarySearch.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/binary-search/description/,
 *   Date:- 2024-04-06,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Uber:Apple:Adobe:Yahoo:Amazon:Google:Facebook:Microsoft:Bloomberg,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class BinarySearch {

    public static int search(int[] arr, int target) {
        if(arr.length == 1) {
            return arr[0] == target ? 0 : -1;
        }
        int searchType = arr[0] < arr[arr.length-1] ? 0 : 1;
        int start = searchType == 0 ? 0 : arr.length-1;
        int end = searchType == 0 ? arr.length-1 : 0;
        while(searchType == 0 ? start <= end : start >= end) {
            int mid = start + (end - start) /2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                if(searchType == 0) start = mid + 1;
                else end = mid - 1;
            } else {
                if(searchType == 0) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        System.out.println(search(new int[]{21, 15, 10, 6, 1}, 10));
    }
}
