package BitManipulation;

public class EvenOdd {

    public static void main(String args[]) {
        int n = 8;
        String ans = getBit(0, n) == 1 ? "Odd" : "Even";
        System.out.println("The No is "+ans);
    }

    public static int getBit(int bitAt, int n) {
        int mask = 1 << bitAt;
        /*System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println("Bit at "+bitAt + ": "+ ((n & mask) >> bitAt));*/
        return ((n & mask) >> bitAt);
    }

}


