package Bit_Manipulation;

public class ResetBit {
    public static void main(String args[]) {
        int n = 9;
        int bitAt = 3;
        int mask = 1 << bitAt;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println("Reset Bit at "+bitAt + ": "+ Integer.toBinaryString((n ^ mask)));

    }
}
