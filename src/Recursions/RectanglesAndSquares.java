package Recursions;


/*
 * <metadata>
 * <name>Rectangles And Squares</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Rectangles_Squares.png"></description>
 * <status>Completed</status>
 * <url>https://practice.geeksforgeeks.org/contest/job-a-thon-11-hiring-challenge/problems</url>
 * <date>2024-03-29</date>
 * <level>Easy</level>
 * <notes>Create a helper function and if a == b return 1 else choose according to condition</notes>
 * </metadata>
 * */
public class RectanglesAndSquares {
    public static int minimumMoves(int A, int B) {
        return helper(A, B);
    }

    public static int helper(int a, int b) {

        if(a == 1) return b;
        if(b == 1) return a;
        if(a == b)  return 1;
        if(a < b) {
            return helper(a, b-a)+1;
        }else {
            return helper(a-b, b)+1;
        }
    }
}
