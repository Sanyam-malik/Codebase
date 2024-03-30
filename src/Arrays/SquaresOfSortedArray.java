package Arrays;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Squares of a Sorted Array,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9000/codebase/Squares_Sorted_Array.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/squares-of-a-sorted-array/description/,
 *   Date:- 2024-03-08,
 *   Level:- Easy,
 *   Companies:- Amazon:Google:Paypal:Facebook:Microsoft,
 *   Notes:- Solution 1 Hint - Use Inbuilt Sort and Math.pow</br></br>
 *           Solution 2 Hint - Use save math.pow or simply do nums[i]*nums[i] for reduced time use extra space and two pointers approach,
 * </metadata>
 * */
public class SquaresOfSortedArray {

    public int[] sortedSquaresInbuildSort(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            nums[i] = (int)Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        // Square all elements
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int head = 0;
        int tail = nums.length - 1;

        // Set them at right place in the result array
        for (int pos = nums.length - 1; pos >= 0; pos--) {

            if (nums[head] > nums[tail]) {
                result[pos] = nums[head];
                // Increment head pointer
                head++;
            } else {
                result[pos] = nums[tail];
                // Increment tail pointer
                tail--;
            }
        }

        return result;
    }

}
