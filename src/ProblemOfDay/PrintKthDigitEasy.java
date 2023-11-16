package ProblemOfDay;

import java.util.ArrayList;
import java.util.List;

public class PrintKthDigitEasy {

    public static int findKthFromRight(int n, int m, int k) {
        int power = (int)(Math.pow(n, m));
        int iteration = 0;
        int result = 0;

        int digits = ((int)Math.log10(power)+1);
        while (iteration < k && digits != iteration) {
            result = power % 10;
            power = power / 10;
            iteration++;
        }
        return result;
    }

    public static void main(String[] a) {
        System.out.println(findKthFromRight(11, 13, 11));
    }
}
