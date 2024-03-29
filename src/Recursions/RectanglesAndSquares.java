package Recursions;


/*
 * <metadata>
 *   Name:- Rectangles And Squares,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Rectangles_Squares.png">,
 *   Status:- Completed,
 *   URL:- https://practice.geeksforgeeks.org/contest/job-a-thon-11-hiring-challenge/problems,
 *   Date:- 2024-03-29,
 *   Level:- Easy,
 *   Notes:- Create a helper function and if a == b return 1 else choose according to condition,
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
