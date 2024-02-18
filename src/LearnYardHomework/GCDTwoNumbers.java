package LearnYardHomework;

/*
 * <metadata>
 *   Name:- GCD of two numbers,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class GCDTwoNumbers {

    public static int gcd(int A , int B) {
        int gcd = 1;
        int value = Math.min(A, B);
        for(int i=2; i<= value; i++) {
            if(A%i==0 && B%i==0) gcd = i;
        }
        return gcd;
    }

    public static void main(String args[]) {
        System.out.println(gcd(1, 1));
    }
}
