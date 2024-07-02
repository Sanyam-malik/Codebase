package Basics;

public class ArmstrongNumbers {

    static String armstrongNumber(int n) {
        int original = n;
        int digits = (int)Math.log10(n)+1;
        int sum = 0;
        while(n > 0) {
            sum += (int)Math.pow(n%10, digits);
            n = n/10;
        }


        if(original == sum) {
            return "true";
        } else {
            return "false";
        }
    }
}
