package Basics;

/*
 * <metadata>
 * <name>Plus or Minus</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Plus_Minus.png"></description>
 * <status>Completed</status>
 * <url>https://codeforces.com/problemset/problem/1807/A</url>
 * <date>2024-02-14</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks></remarks>
 * </metadata>
 * */
public class PlusMinus {

    public static Character plusOrMinus(int a, int b, int c) {
        if(c == (a + b)) {
            return '+';
        }
        else if(c == (a-b)) {
            return '-';
        }
        return ' ';
    }

    public static void main(String args[]) {
        System.out.println(plusOrMinus(2, 9, -7));
    }
}
