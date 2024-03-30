package Arrays;


/*
 * <metadata>
 *   Name:- Rearrange Array Elements by Sign,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9000/codebase/Rearrange_Array_Elements.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/rearrange-array-elements-by-sign/description/,
 *   Date:- 2024-03-08,
 *   Level:- Medium,
 *   Companies:- Amazon,
 *   Notes:- Solution 1 - Use Extra Space and add position and negative elements to their respective array and combine them to result array</br></br>
 *           Solution 2 - Use separate indexes for positive and negative nos and each time if either positive and negative no is found increment them by 2,
 * </metadata>
 * */
public class RearrangeElementsBySign {

    public int[] rearrangeArray(int[] nums) {

        int[] arr = new int[nums.length];
        int c1 = 0;
        int c2 = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                arr[c1] = nums[i];
                c1 = c1 + 2;
            } else {
                arr[c2] = nums[i];
                c2 = c2 + 2;
            }
        }
        return arr;
    }

    public int[] rearrangeArrayExtraSpace(int[] nums) {
        int[] positiveNos = new int[nums.length/2];
        int[] negativeNos = new int[nums.length/2];
        int negativeIndex = 0;
        int positiveIndex = 0;

        for(int i=0; i< nums.length; i++) {
            if(nums[i] > 0) {
                positiveNos[positiveIndex++] = nums[i];
            } else {
                negativeNos[negativeIndex++] = nums[i];
            }
        }

        negativeIndex = 0;
        positiveIndex = 0;

        int[] result = new int[nums.length];
        for(int i=0; i< nums.length; i+=2) {
            result[i] = positiveNos[positiveIndex++];
            result[i+1] = negativeNos[negativeIndex++];
        }

        return result;
    }


}
