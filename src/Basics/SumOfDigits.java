package Basics;

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
