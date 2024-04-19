package Extra_Problems.Arrays;

/*
 * <metadata>
 * <name>Concatenation of Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Concatenation_of_Array.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/concatenation-of-array</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <companies>Adobe:Google</companies>
 * <notes>No Notes Needed</notes>
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
