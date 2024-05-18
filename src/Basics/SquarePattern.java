package Basics;


/*
 * <metadata>
 * <name>Square Pattern</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Square_Star_Pattern.png"></description>
 * <status>Completed</status>
 * <url>https://codeforwin.org/c-programming/square-star-pattern-in-c</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks></remarks>
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
