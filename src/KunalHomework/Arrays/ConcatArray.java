package KunalHomework.Arrays;

/*
 * <metadata>
 *   Name:- Concatenation of Array,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/concatenation-of-array,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class ConcatArray {

    public int[] getConcatenation(int[] nums) {
        int[] temp = new int[2*nums.length];
        for(int k=0; k< temp.length; k++) {
            temp[k] = nums[k % nums.length];
        }
        return temp;
    }
}
