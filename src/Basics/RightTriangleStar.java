package Basics;

/*
 * <metadata>
 *   Name:- Right triangle Star Pattern,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF80MC5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://codeforwin.org/c-programming/right-triangle-star-pattern-program-in-c,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Remarks:- Revised Once:Needs Practice of Related Problems,
 * </metadata>
 * */
public class RightTriangleStar {

    public static void printRightTriangleStar(int n) {
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        printRightTriangleStar(5);
    }
}
