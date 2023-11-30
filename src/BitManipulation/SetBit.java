package BitManipulation;

public class SetBit {
    public static void main(String args[]) {
        int n = 8;
        int bitAt = 2;
        int mask = 1 << bitAt;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println("Set Bit at "+bitAt + ": "+ Integer.toBinaryString((n | mask)));

    }
}
