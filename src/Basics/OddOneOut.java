package Basics;

/*
 * <metadata>
 * <name>Odd One Out</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Odd_One_Out.png"></description>
 * <status>Completed</status>
 * <url>https://codeforces.com/contest/1915/problem/A</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class OddOneOut {

    public static int oddOneOut(int a, int b, int c) {
        if( a == b) {
            return c;
        } else if(b == c) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        System.out.println(oddOneOut(1, 1, 2));
    }
}
