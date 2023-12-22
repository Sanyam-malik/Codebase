package Basics;

public class AddMultiplyBinaryNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        int sum = Integer.parseInt(String.valueOf(a), 2) + Integer.parseInt(String.valueOf(b), 2);
        int multiply = Integer.parseInt(String.valueOf(a), 2) * Integer.parseInt(String.valueOf(b), 2);
        System.out.println(Integer.toBinaryString(sum));
        System.out.println(Integer.toBinaryString(multiply));
    }
}
