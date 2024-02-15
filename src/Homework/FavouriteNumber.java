package Homework;

/*
 * <metadata>
 *   Name:- Favourite Numbers,
 *   Status:- Completed,
 *   URL:- https://www.codechef.com/problems/FAVOURITENUM,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
