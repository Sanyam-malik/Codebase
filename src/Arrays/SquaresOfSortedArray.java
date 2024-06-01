package Arrays;
import java.util.Arrays;

/*
 * <metadata>
 * <name>Squares of a Sorted Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Squares_Sorted_Array.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/squares-of-a-sorted-array/description/</url>
 * <date>2024-06-01</date>
 * <level>Easy</level>
 * <companies>Amazon:Google:Paypal:Facebook:Microsoft</companies>
 * <notes>Solution 1 Hint - Use Inbuilt Sort and Math.pow</br></br>            Solution 2 Hint - Use save math.pow or simply do nums[i]nums[i] for reduced time use extra space and two pointers approach</notes>
 * </metadata>
 * */
public class SquaresOfSortedArray {

    /*
    *
    *
    * Time complexity:O(nlogn)
    * Space complexity:O(1)
    *
    * */
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    /*
    *
    * Time complexity:O(n)
    * Space complexity:O(n)
    * */
    public int[] sortedSquaresTwoPointers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int start = 0, end = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                ans[i] = nums[start] * nums[start];
                start++;
            } else {
                ans[i] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }

}
