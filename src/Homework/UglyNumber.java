package Homework;

/*
 * <metadata>
 *   Name:- Ugly Number,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/ugly-number,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class UglyNumber {

    public static boolean isUgly(int n) {
        while (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 && n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                n = n / 3;
            }
        }

        if(n > 1) {
            return false;
        } else {
             return true;
        }
    }

    public static void main(String args[]) {
        System.out.println(isUgly(14));
    }
}
