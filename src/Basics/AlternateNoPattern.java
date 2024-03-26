package Basics;

/*
 * <metadata>
 *   Name:- Alternate Number Pattern,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Alternative_Number_Pattern.png">,
 *   Status:- Completed,
 *   URL:- https://codeforwin.org/c-programming/c-program-to-print-number-pattern-with-0-1-at-alternate-rows,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- At even places 0 else 1,
 *   Remarks:- Revised Once,
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
