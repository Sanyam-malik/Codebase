package Basics;

/*
 * <metadata>
 * <name>Right triangle Star Pattern</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Right_Triangle_Star.png"></description>
 * <status>Completed</status>
 * <url>https://codeforwin.org/c-programming/right-triangle-star-pattern-program-in-c</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks></remarks>
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
