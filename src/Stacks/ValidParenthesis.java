package Stacks;

import java.util.Stack;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/valid-parenthesis_795104,
 *   Date:- 2023-12-03
 * </metadata>
 * */
public class ValidParenthesis {

    public static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(ch == '{' || ch == '[' || ch == '(') stack.push(ch);
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else return false;
        }

        return stack.isEmpty();
    }

    public static void main(String args[]) {
        System.out.println(isValidParenthesis("[[}["));
    }
}
