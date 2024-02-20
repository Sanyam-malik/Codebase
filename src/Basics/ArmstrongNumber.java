package LearnYardHomework;

public class ArmstrongNumber {
    static String armstrongNumber(int n){
        int digits = (int) (Math.log10(n)+1);
        char[] str = Integer.toString(n).toCharArray();
        int sum = 0;
        for(char ch: str) {
            sum+= (int) Math.pow(Character.getNumericValue(ch), digits);
        }

        if(sum == n) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String args[]) {
        System.out.println(armstrongNumber(372));
    }
}
