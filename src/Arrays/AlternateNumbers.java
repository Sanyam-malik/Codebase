package Arrays;

import java.util.ArrayList;
import java.util.List;


/*
 * <metadata>
 *   Name:- Alternate positive and negative numbers,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF81LnBuZw==&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1,
 *   Date:- 2024-03-07,
 *   Level:- Easy,
 *   Companies:- Paytm:VMWare:Amazon:Microsoft:Intuit,
 *   Notes:- Solution Hint - Two Arrays Lists,
 * </metadata>
 * */
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
