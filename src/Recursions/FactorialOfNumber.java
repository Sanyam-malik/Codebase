package Recursions;



/*
 * <metadata>
 *   Name:- Factorial Of Number,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/program-for-factorial-of-a-number/,
 *   Date:- 2024-03-15,
 *   Level:- Easy,
 * </metadata>
 * */
public class FactorialOfNumber {

    public static int FactOfN(int n) {
        if(n == 1) return 1;
        int fact = FactOfN(n-1);
        return n * fact;
    }


    public static void main(String args[]) {
        System.out.println(FactOfN(6));
    }


}
