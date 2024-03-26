package Basics;

/*
 * <metadata>
 *   Name:- Favourite Numbers,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Favourite_Numbers.png">,
 *   Status:- Completed,
 *   URL:- https://www.codechef.com/problems/FAVOURITENUM,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- Simple If Statements,
 *   Remarks:- Revised Once,
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
