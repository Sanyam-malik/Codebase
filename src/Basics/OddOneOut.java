package LearnYardHomework;

/*
 * <metadata>
 *   Name:- Odd One Out,
 *   Status:- Completed,
 *   URL:- https://codeforces.com/contest/1915/problem/A,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class OddOneOut {

    public static int oddOneOut(int a, int b, int c) {
        if( a == b) {
            return c;
        } else if(b == c) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        System.out.println(oddOneOut(1, 1, 2));
    }
}
