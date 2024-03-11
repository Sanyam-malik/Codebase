package Basics;

/*
 * <metadata>
 *   Name:- Alternate Number Pattern,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8zMi5wbmc=&version_id=null">,
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
