package Recursions;



/*
 * <metadata>
 * <name>Factorial Of Number</name>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/program-for-factorial-of-a-number/</url>
 * <date>2024-03-15</date>
 * <level>Easy</level>
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
