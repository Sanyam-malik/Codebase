package Basics;

/*
 * <metadata>
 *   Name:- Odd One Out,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Odd_One_Out.png">,
 *   Status:- Completed,
 *   URL:- https://codeforces.com/contest/1915/problem/A,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Remarks:- Revised Once,
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
