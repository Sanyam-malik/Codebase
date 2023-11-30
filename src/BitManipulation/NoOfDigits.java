package BitManipulation;

public class NoOfDigits {

    public static void main(String args[]) {
        int n = 8;
        int count = 0;
        while(n!=0) {
            n = n >> 1 ;
            count++;
        }
        System.out.println("No of digits: " + count);

    }
}
