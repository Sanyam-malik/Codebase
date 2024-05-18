package Basics;


/*
 * <metadata>
 * <name>Armstrong Numbers</name>
 * <description>Given a number x determine whether the given number is Armstrong's number or not.    </br>A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if    </br>abcd... = pow(a n) + pow(b n) + pow(c n) + pow(d n) + ....    </br><img src="http://lordmaximus.duckdns.org:9000/codebase/ArmstrongNo.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/program-for-armstrong-numbers/</url>
 * <date>2024-03-11</date>
 * <level>Easy</level>
 * <notes>Get Digits of the no if get power of each digit raised to power of total digits</notes>
 * <remarks></remarks>
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
