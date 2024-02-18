package LearnYardHomework;

/*
 * <metadata>
 *   Name:- Power of Two,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/power-of-two,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class PowerOfTwo {

    /*
    * Althrough It works in real mathematics it will not work in java due to inaccuracy of precision
    * */
    public static boolean isPowerOfTwo(int n) {
        double temp = (Math.log(n)/Math.log(2));
        System.out.println(temp);
        return temp % 1 == 0;
    }

    public static boolean isPowerOfTwoBit(int n) {
        return (n & (n-1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwoBit(536870912));
    }
}
