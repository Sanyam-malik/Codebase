package Stacks;

import java.util.Arrays;
import java.util.Stack;

/*
 * <metadata>
 * <name>Next Greater Element II</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/NextGreatorElementII.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/next-greater-element-ii/description/</url>
 * <date>2024-05-20</date>
 * <level>Medium</level>
 * <remarks>Good Question</remarks>
 * <companies>Yahoo:Apple:Adobe:Amazon:TikTok:Google:Samsung:Facebook:Bloomberg:Microsoft</companies>
 * <notes>Using Stack, Temp Array and Map</notes>
 * </metadata>
 * */
public class NextGreaterElementII {

    public static int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        /*
         * Finding New Greator Element for all
         * */
        Stack<Integer> stack = new Stack<>();
        for(int i = (2* length)-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums[i%length]) {
                stack.pop();
            }
            result[i % length] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i%length]);
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1,2,1})));
    }
}
