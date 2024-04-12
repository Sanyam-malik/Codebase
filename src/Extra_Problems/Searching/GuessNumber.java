package Extra_Problems.Searching;

import java.util.Random;


/*
 * <metadata>
 *   Name:- Guess Number Higher or Lower,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/GuessNumber.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/guess-number-higher-or-lower/submissions/1230136159/,
 *   Date:- 2024-04-12,
 *   Level:- Easy,
 *   Notes:- Use Binary Search,
 *   Remarks:- Kunal Kushwaha,
 *   Companies:- Adobe:Bloomberg,
 * </metadata>
 * */
public class GuessNumber {

    static int no = 0;

    public static int guessNumber(int n) {
        int start = 0;
        int end = n;
        while(start <= end) {
            int mid = start + (end - start)/2;
            int ask = guess(mid);
            if(ask == 0) return mid;
            else if(ask == -1) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    static int guess(int num) {
        return Integer.compare(no, num);
    }

    public static void main(String args[]) {
        no = new Random().nextInt(100);
        System.out.println(guessNumber(100));
    }


}
