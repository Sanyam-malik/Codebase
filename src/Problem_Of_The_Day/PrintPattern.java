package Problem_Of_The_Day;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/print-the-pattern_893299
 * </metadata>
 * */
public class PrintPattern {

    public static String[] NumberPattern(int n) {
        String[] strArray = new String[n];
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        int count = 0;
        boolean saveSwitch = false;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=Math.pow(n, 2); i++) {
            if(count == n) {
                if(!saveSwitch) {
                    queue.add(sb.toString().trim());
                } else {
                    stack.add(sb.toString().trim());
                }
                saveSwitch = !saveSwitch;
                count=0;
                sb = new StringBuilder();
            }
            sb.append(" "+i);
            count++;
        }

        //Store last Iteration Changes as Well
        if(!saveSwitch) {
            queue.add(sb.toString().trim());
        } else {
            stack.add(sb.toString().trim());
        }

        int iterator = 0;
        while (!queue.isEmpty()) {
            strArray[iterator] = queue.poll();
            iterator++;
        }
        while (!stack.isEmpty()) {
            strArray[iterator] = stack.pop();
            iterator++;
        }
        return strArray;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(NumberPattern(5)));
    }
}
