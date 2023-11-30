package Strings;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/minimum-parentheses-_1075018,
 * </metadata>
 * */
public class Paranthesis {

    public static int minimumParentheses(String p) {
        int bal = 0;
        int ans = 0;

        for (int i = 0; i < p.length(); ++i) {

            bal += p.charAt(i) == '(' ? 1 : -1;

            // It is guaranteed bal >= -1
            if (bal == -1) {
                ans += 1;
                bal += 1;
            }
        }

        return bal + ans;
    }

    public static void main(String[] a) {
        System.out.println(minimumParentheses(")((()"));
    }
}
