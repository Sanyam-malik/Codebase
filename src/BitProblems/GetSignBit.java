package BitProblems;

public class GetSignBit {
    public static void main(String[] args) {
        int n = 9;
        String ans = ((n >> 31) == -1) ? "Negative" : "Positive";
        System.out.println("Given no is "+ans);
    }
}
