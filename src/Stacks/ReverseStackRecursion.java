package Stacks;
import java.util.*;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/reverse-stack-using-recursion_631875,
 *   Date:- 2023-12-03
 * </metadata>
 * */
public class ReverseStackRecursion {

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            reverseStack(stack);
            utilReverse(stack, top);
        }
    }

    public static void utilReverse(Stack<Integer> stack, int current) {
        if (stack.isEmpty()) {
            stack.push(current);
            return;
        }
        int top = stack.pop();
        utilReverse(stack, current);
        stack.push(top);
    }


    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(1);
        s.push(3);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
