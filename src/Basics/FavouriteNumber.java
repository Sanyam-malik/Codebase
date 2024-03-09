package Basics;

/*
 * <metadata>
 *   Name:- Favourite Numbers,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8zMS5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://www.codechef.com/problems/FAVOURITENUM,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- Simple If Statements,
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
