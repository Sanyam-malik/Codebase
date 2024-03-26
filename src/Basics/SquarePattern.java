package Basics;


/*
 * <metadata>
 *   Name:- Square Pattern,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Square_Star_Pattern.png">,
 *   Status:- Completed,
 *   URL:- https://codeforwin.org/c-programming/square-star-pattern-in-c,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Remarks:- Revised Once:Needs Practice of Related Problems,
 * </metadata>
 * */
public class SquarePattern {
    public static void printSquarePattern(int n) {
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        printSquarePattern(5);
    }
}
