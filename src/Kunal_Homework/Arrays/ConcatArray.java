package Kunal_Homework.Arrays;

/*
 * <metadata>
 *   Name:- Concatenation of Array,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Concatenation_of_Array.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/concatenation-of-array,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Companies:- Adobe:Google,
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
