package Strings;
import java.util.*;



/*
 * <metadata>
 *   Name:- Make The String Great,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9000/codebase/MakeStringGreat.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/make-the-string-great/description/,
 *   Date:- 2024-03-06,
 *   Level:- Easy,
 *   Companies:- Adobe:Google,
 *   Notes:- Solution Hint - Use Stacks Why because if Uppercase alphabet is found we have delete its corresponding lowercase character then recheck,
 * </metadata>
 * */
public class MakeStringGood {
    public static String makeGood(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {

            if(!stack.isEmpty() &&stack.peek()!=s.charAt(i)){
                String t1=""+stack.peek();
                String t2=""+s.charAt(i);
                if(t1.equalsIgnoreCase(t2))stack.pop();
                else stack.push(s.charAt(i));
            }
            else
                stack.push(s.charAt(i));

        }
        String str="";
        while(!stack.isEmpty()){
            str=stack.pop()+str;
        }
        return str;

    }

    public static void main(String args[]) {
        System.out.println(makeGood("leEeetcode"));
    }
}
