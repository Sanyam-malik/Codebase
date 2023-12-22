package Basics;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 9;
        int b = 7;

        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a);
        System.out.println(b);
    }
}
