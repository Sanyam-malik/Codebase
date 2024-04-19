package Basics;


/*
 * <metadata>
 * <name>Hollow Square Star Pattern</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Hollow_Star_Pattern.png"></description>
 * <status>Completed</status>
 * <url>https://read.learnyard.com/square-star-and-rhombus-start-patterns/</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class HollowSquarePattern {

    static void printHollowSquare(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        printHollowSquare(5);
    }
}
