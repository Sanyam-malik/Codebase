package Basics;

/*
 * <metadata>
 * <name>Alternate Number Pattern</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Alternative_Number_Pattern.png"></description>
 * <status>Completed</status>
 * <url>https://codeforwin.org/c-programming/c-program-to-print-number-pattern-with-0-1-at-alternate-rows</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <notes>At even places 0 else 1</notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class AlternateNoPattern {

    public static void printAlternateNoPattern(int n) {
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n ; j++) {
                System.out.print(i%2 != 0 ? "1" : "0");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        printAlternateNoPattern(6);
    }
}
