package Bit_Manipulation;

public class TwoComplement {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(~n+1));
        System.out.println("Positive Number: " + n);
        System.out.println("Negative Number: " + (~n+1));
    }
}
