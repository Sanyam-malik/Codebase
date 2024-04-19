package Searching;


/*
 * <metadata>
 * <name>Binary Searchable Elements I</name>
 * <description>Given an array [1 14 6 21 57 8] try to find the elements that can be searched using binary search</description>
 * <status>Completed</status>
 * <url>https://learnyard.com</url>
 * <date>2024-04-08</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks>LearnYard Problem</remarks>
 * </metadata>
 * */
public class BinarySearchableElementsI {
    public static int traditionalSearch(int[] arr, int start, int end, int target){
        while(start <= end) {
            int mid = start + (end - start) /2;
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
            if(traditionalSearch(nums, 0, nums.length-1, num) != -1) {
                elems++;
            }
        }
        System.out.println(elems);
    }

}
