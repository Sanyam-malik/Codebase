package BitProblems;

public class GetBit {

    public static void main(String args[]) {
        int n = 8;
        int bitAt = 3;
        int mask = 1 << bitAt;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println("Bit at "+bitAt + ": "+ ((n & mask) >> bitAt));

    }
}
