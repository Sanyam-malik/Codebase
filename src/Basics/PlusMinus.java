package LearnYardHomework;

/*
 * <metadata>
 *   Name:- Plus or Minus,
 *   Status:- Completed,
 *   URL:- https://codeforces.com/problemset/problem/1807/A,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class PlusMinus {

    public static Character plusOrMinus(int a, int b, int c) {
        if(c == (a + b)) {
            return '+';
        }
        else if(c == (a-b)) {
            return '-';
        }
        return ' ';
    }

    public static void main(String args[]) {
        System.out.println(plusOrMinus(2, 9, -7));
    }
}
