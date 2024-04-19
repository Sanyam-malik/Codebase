package Searching;


/*
 * <metadata>
 * <name>Binary Search</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/BinarySearch.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/binary-search/description/</url>
 * <date>2024-04-06</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Uber:Apple:Adobe:Yahoo:Amazon:Google:Facebook:Microsoft:Bloomberg</companies>
 * <remarks>LearnYard Problem</remarks>
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
