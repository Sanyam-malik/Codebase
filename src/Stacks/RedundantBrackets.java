package Stacks;
import java.util.*;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/redundant-brackets_975473,
 *   Date:- 2023-12-03
 * </metadata>
 * */
public class RedundantBrackets {

    public static boolean findRedundantBrackets(String str) {
        Stack<Character> s = new Stack<>(); // Initialize a stack to hold characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            // Push '(' or operators onto the stack
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                s.push(ch);
            } else { // For other characters
                if (ch == ')') { // If the character is ')'
                    boolean ans = true;
                    // Check for operators within brackets
                    while (s.peek() != '(') {
                        char top = s.peek();
                        if (top == '+' || top == '-' || top == '*' || top == '/') {
                            ans = false;
                        }
                        s.pop();
                    }

                    if (ans) { // If operators were not found within brackets
                        return true; // Brackets are redundant
                    }
                    s.pop(); // Remove the open bracket
                }

            }

        }

        return false; // No redundant brackets found

    }

    public static void main(String args[]) {
        System.out.println(findRedundantBrackets("(a)"));
    }

}
