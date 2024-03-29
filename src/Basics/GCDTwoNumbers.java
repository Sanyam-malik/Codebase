package Basics;

/*
 * <metadata>
 *   Name:- GCD of two numbers,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/GCD_Two_Numbers.png">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- Start from 1 to minimum no of the two and check modulus or Use Euclidean algorithm <a href="https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/">Click here</a>,
 *   Remarks:- Revised Once:Needs Learning:Solve Using Euclidean Algorithm,
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
