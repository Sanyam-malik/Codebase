package LearnYardHomework;

/*
 * <metadata>
 *   Name:- Sum Of Digits,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/sum-of-digits1742/1,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class SumOfDigits {

    static int sumOfDigits(int N) {
        int sum = 0;
        while(N > 0) {
            sum += N%10;
            N=N/10;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(sumOfDigits(42));
    }
}
