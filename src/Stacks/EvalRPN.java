package Stacks;

import java.util.Stack;


/*
 * <metadata>
 * <name>Evaluate Reverse Polish Notation</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/EvalRPN.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/evaluate-reverse-polish-notation/description/</url>
 * <date>2024-05-21</date>
 * <level>Medium</level>
 * <notes>Use Stacks</notes>
 * <companies>Google:Amazon:Oracle:Yandex:LinkedIn:Facebook:Microsoft</companies>
 * </metadata>
 * */
public class EvalRPN {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens) {
            if(token.equals("+")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1+operand2);
            } else if(token.equals("-")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1-operand2);
            } else if(token.equals("*")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1*operand2);
            } else if(token.equals("/")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1/operand2);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String args[]) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
    }
}
