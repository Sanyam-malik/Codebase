package Strings;
import java.util.*;



/*
 * <metadata>
 * <name>Make The String Great</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MakeStringGreat.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/make-the-string-great/description/</url>
 * <date>2024-03-06</date>
 * <level>Easy</level>
 * <companies>Adobe:Google</companies>
 * <notes>Solution Hint - Use Stacks Why because if Uppercase alphabet is found we have delete its corresponding lowercase character then recheck</notes>
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
