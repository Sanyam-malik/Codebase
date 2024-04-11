package Searching;


/*
 * <metadata>
 *   Name:- Binary Searchable Elements II,
 *   Description:- Given an array [1 14 6 21 57 8] try to find the elements that can be searched using binary search if middle is chosen randomly,
 *   Status:- Completed,
 *   URL:- https://learnyard.com,
 *   Date:- 2024-04-08,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class BinarySearchableElementsII {
    public static int randomBinarySearch(int[] arr, int start, int end, int target){
        while(start <= end) {
            int mid = start + ((int)Math.random()) % (end - start + 1);
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] nums = {1, 14, 6, 21, 57, 8};
        int elems = 0;
        for(int num : nums) {
            if(randomBinarySearch(nums, 0, nums.length-1, num) != -1) {
                elems++;
            }
        }
        System.out.println(elems);
    }

}
