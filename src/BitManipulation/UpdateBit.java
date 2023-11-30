package BitManipulation;

public class UpdateBit {
    public static void main(String args[]) {
        int n = 8;
        int bitAt = 0;
        int mask = 1 << bitAt;
        int ans = 0;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        ans = getBit(bitAt, n) == 1 ? resetBit(bitAt, n)  : setBit(bitAt, n) ;
        System.out.println("Update Bit at "+bitAt + ": "+ Integer.toBinaryString(ans));

    }

    public static int getBit(int bitAt, int n) {
        int mask = 1 << bitAt;
        /*System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println("Bit at "+bitAt + ": "+ ((n & mask) >> bitAt));*/
        return ((n & mask) >> bitAt);
    }

    public static int setBit(int bitAt, int n) {
        int mask = 1 << bitAt;
        /*System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println("Set Bit at "+bitAt + ": "+ Integer.toBinaryString((n | mask)));*/
        return (n | mask);
    }

    public static int resetBit(int bitAt, int n) {
        int mask = 1 << bitAt;
        /*System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println("Reset Bit at "+bitAt + ": "+ Integer.toBinaryString((n ^ mask)));*/
        return (n ^ mask);
    }
}
