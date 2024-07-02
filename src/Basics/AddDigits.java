package Basics;

public class AddDigits {

    public int addDigits(int num) {
        int sum = addDigitsHelper(num);
        int numberOfDigits = (int) Math.log10(sum) + 1;
        while(numberOfDigits > 1) {
            sum = addDigitsHelper(sum);
            numberOfDigits = (int) Math.log10(sum) + 1;
        }
        return sum;
    }

    public int addDigitsHelper(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
