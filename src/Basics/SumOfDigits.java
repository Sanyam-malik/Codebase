package Basics;

/*
 * <metadata>
 * <name>Sum Of Digits</name>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/sum-of-digits1742/1</url>
 * <date>2024-07-02</date>
 * <level>Easy</level>
 * </metadata>
 * */
public class SumOfDigits {

    static int sumOfDigits(int N) {
        int sum = 0;
        while(N > 0) {
            sum += N%10;
            N = N/10;
        }
        return sum;
    }
}
