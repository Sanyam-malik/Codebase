package Searching;

/*
 * <metadata>
 *   Name:- Number of occurrence - Revision,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Number_of_Occurence.png">,
 *   URL:- https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Companies:- Zoho:Amazon:MakeMyTrip,
 *   Notes:- Using Binary search Find First Occurrence and Last Occurrence then do last - first + 1,
 * </metadata>
 * */
public class NumberOfOccurence {

    static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Update the result and continue searching on the left side
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Function to find the last occurrence of a target element using binary search
    static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Update the result and continue searching on the right side
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Function to count occurrences of a target element in a sorted array
    static int count(int[] arr, int n, int target) {
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        if (first == -1 || last == -1) {
            return 0; // Element not found
        }

        return last - first + 1;
    }

    public static void main(String args[]) {
        System.out.println(count(new int[]{1,1,2,2,2,2,3,3}, 8,2));
    }
}
