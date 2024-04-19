package Arrays;

import java.util.ArrayList;
import java.util.List;


/*
 * <metadata>
 * <name>Alternate positive and negative numbers</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Alternate_Positive_Negative_Numbers.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1</url>
 * <date>2024-03-07</date>
 * <level>Easy</level>
 * <companies>Paytm:VMWare:Amazon:Microsoft:Intuit</companies>
 * <notes>Solution Hint - Two Arrays Lists</notes>
 * </metadata>
 */
public class AlternateNumbers {

    static void rearrange(int[] arr, int n) {
        // code here
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positiveNumbers.add(arr[i]);
            } else {
                negativeNumbers.add(arr[i]);
            }
        }

        // Merge positive and negative numbers alternately
        int i = 0, j = 0, k = 0;
        while (i < positiveNumbers.size() && j < negativeNumbers.size()) {
            arr[k++] = positiveNumbers.get(i++);
            arr[k++] = negativeNumbers.get(j++);
        }

        // If there are remaining positive numbers, add them to the result
        while (i < positiveNumbers.size()) {
            arr[k++] = positiveNumbers.get(i++);
        }

        // If there are remaining negative numbers, add them to the result
        while (j < negativeNumbers.size()) {
            arr[k++] = negativeNumbers.get(j++);
        }

    }

    public static void main(String args[]) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr, arr.length);
    }
}
