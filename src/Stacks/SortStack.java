package Stacks;

import java.util.*;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/sort-a-stack_985275,
 *   Date:- 2023-12-01
 * </metadata>
 * */
public class SortStack {
    /*public static void sortStack(StackOperations<Integer> stack) {
        // Write your code here.
        Collections.sort(stack);
    }*/



    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(5, -1, 2, -3));
        sortStack(stack);
    }

    private static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        sortInserted(top, stack);
    }

    private static void sortInserted(int current, Stack<Integer> stack) {
        //Do Nothing;
        if(stack.empty() || current > stack.peek()) {
            stack.push(current);
            return;
        }
        int top = stack.pop();
        sortInserted(current, stack);
        stack.push(top);
    }
}
