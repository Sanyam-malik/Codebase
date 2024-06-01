package Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * <metadata>
 * <name>Alternate positive and negative numbers</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Alternate_Positive_Negative_Numbers.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1</url>
 * <date>2024-06-01</date>
 * <level>Easy</level>
 * <companies>Paytm:VMWare:Amazon:Microsoft:Intuit</companies>
 * <notes>Solution Hint - Two Arrays Lists or Queue</notes>
 * </metadata>
 */

public class AlternativePositiveAndNegative {

    static void rearrange(int arr[], int n) {
        Queue<Integer> positiveNos = new LinkedList<>();
        Queue<Integer> negativeNos = new LinkedList<>();
        for(int a: arr) {
            if(a >= 0) {
                positiveNos.offer(a);
            } else {
                negativeNos.offer(a);
            }
        }

        for(int i=0; i< n; i+=2) {
            arr[i] = !positiveNos.isEmpty() ? positiveNos.remove() : negativeNos.remove();
            arr[i+1] = !negativeNos.isEmpty() ? negativeNos.remove() : positiveNos.remove();
        }
    }

    public static void main(String args[]) {
        int[] temp = new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(temp, 10);
        System.out.println(Arrays.toString(temp));
    }
}
