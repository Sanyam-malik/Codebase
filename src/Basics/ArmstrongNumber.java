package Basics;


/*
 * <metadata>
 *   Name:- Armstrong Numbers,
 *   Description:- Given a number x determine whether the given number is Armstrong's number or not.
 *   </br>A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if
 *   </br>abcd... = pow(a n) + pow(b n) + pow(c n) + pow(d n) + .... ,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/program-for-armstrong-numbers/,
 *   Date:- 2024-03-11,
 *   Level:- Easy,
 *   Notes:- Get Digits of the no if get power of each digit raised to power of total digits,
 *   Remarks:- Revised Once,
 * </metadata>
 * */
public class ArmstrongNumber {
    static String armstrongNumber(int n){
        int digits = (int) (Math.log10(n)+1);
        char[] str = Integer.toString(n).toCharArray();
        int sum = 0;
        for(char ch: str) {
            sum+= (int) Math.pow(Character.getNumericValue(ch), digits);
        }

        if(sum == n) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String args[]) {
        System.out.println(armstrongNumber(372));
    }
}
