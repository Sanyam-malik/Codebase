package Stacks;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * <metadata>
 * <name>Next Greater Element I</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/NextGreatorElementI.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/next-greater-element-i/description/</url>
 * <date>2024-05-20</date>
 * <level>Easy</level>
 * <remarks>Good Question</remarks>
 * <companies>Uber:Apple:Adobe:Yahoo:Amazon:Google:Facebook:Bloomberg:Microsoft:Goldman Sachs</companies>
 * <notes>Using Stack, Temp Array and Map</notes>
 * </metadata>
 * */
public class NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] temp = new int[nums2.length];

        /*
        * For Index Mapping
        * */
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums2.length; i++) {
            map.put(nums2[i], i);
        }

        /*
        * Finding New Greator Element for all
        * */
        Stack<Integer> stack = new Stack<>();
        for(int i= nums2.length-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            temp[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        int[] result = new int[nums1.length];
        for(int i=0; i< nums1.length; i++) {
            int val = nums1[i];
            result[i] = temp[map.get(val)];
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));
    }
}
