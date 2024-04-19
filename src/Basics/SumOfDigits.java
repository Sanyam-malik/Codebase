package Basics;

/*
 * <metadata>
 * <name>Sum Of Digits</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Sum_of_Digits.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/sum-of-digits1742/1</url>
 * <date>2024-02-14</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class SumOfDigits {

    static int sumOfDigits(int N) {
        int sum = 0;
        while(N > 0) {
            sum += N%10;
            N=N/10;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(sumOfDigits(42));
    }
}
