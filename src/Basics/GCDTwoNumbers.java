package Basics;

/*
 * <metadata>
 * <name>GCD of two numbers</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/GCD_Two_Numbers.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1</url>
 * <date>2024-02-14</date>
 * <level>Easy</level>
 * <notes>Start from 1 to minimum no of the two and check modulus or Use Euclidean algorithm <a href="https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/">Click here</a></notes>
 * <remarks>:Needs Learning:Solve Using Euclidean Algorithm</remarks>
 * </metadata>
 * */
public class GCDTwoNumbers {

    public static int gcd(int A , int B) {
        int gcd = 1;
        int value = Math.min(A, B);
        for(int i=2; i<= value; i++) {
            if(A%i==0 && B%i==0) gcd = i;
        }
        return gcd;
    }

    public static void main(String args[]) {
        System.out.println(gcd(1, 1));
    }
}
