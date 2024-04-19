package Basics;

/*
 * <metadata>
 * <name>Favourite Numbers</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Favourite_Numbers.png"></description>
 * <status>Completed</status>
 * <url>https://www.codechef.com/problems/FAVOURITENUM</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <notes>Simple If Statements</notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class FavouriteNumber {

    static void favouriteNumber(int A){
        if (A%2==0 && A%7==0){
            System.out.println("Alice");
        } else if (A%2==1 && A%9==0){
            System.out.println("Bob");
        } else {
            System.out.println("Charlie");
        }
    }

    public static void main(String args[]) {
        favouriteNumber(7);
    }
}
