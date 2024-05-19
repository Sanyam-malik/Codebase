package Stacks;

import java.util.Stack;


/*
 * <metadata>
 * <name>Regular Bracket Sequence</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/RegularBracketSequence.png"></description>
 * <status>Completed</status>
 * <url>https://codeforces.com/contest/26/problem/B</url>
 * <date>2024-05-20</date>
 * <level>Easy</level>
 * <notes>Using Stack</notes>
 * </metadata>
 * */
public class RegularBracketSequence {


    public static int countBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(Character ch: s.toCharArray()) {
            if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                count+=2;
            }
            else stack.push(ch);
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countBrackets("((()())"));
    }
}
