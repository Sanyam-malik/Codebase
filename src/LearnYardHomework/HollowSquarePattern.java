package LearnYardHomework;


/*
 * <metadata>
 *   Name:- Hollow Square Star Pattern,
 *   Status:- Completed,
 *   URL:- https://read.learnyard.com/square-star-and-rhombus-start-patterns/,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
