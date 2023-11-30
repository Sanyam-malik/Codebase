package Problem_Of_The_Day;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/print-the-kth-digit_1214937
 * </metadata>
 * */
public class PrintKthDigitEasy {

    public static int findKthFromRight(int n, int m, int k) {
        String x=(long)Math.pow(n,m)+"";
        char ch=x.charAt(x.length()-k);
        return ch-48;
    }

    public static void main(String[] a) {
        System.out.println(findKthFromRight(11, 13, 11));
    }
}
