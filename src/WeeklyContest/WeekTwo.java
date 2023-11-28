package WeeklyContest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeekTwo {

    /* Uppercase OR Lowercase */
    static String uppercaseORLowercase(int n, String s) {
        // Write your code here.
        int lower = 0;
        int upper = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                lower++;
            } else {
                upper++;
            }
        }

        return lower >= upper ? s.toLowerCase() : s.toUpperCase();
    }

    /* Divisible Sequences */
    static int countSequences(int n, int []a) {
        ArrayList<ArrayList<ArrayList<Integer>>> pairs = new ArrayList<>();

        ArrayList<Integer> lastPair = new ArrayList<>();
        for(int i=0; i<a.length;i++) {
            ArrayList<ArrayList<Integer>> pair = new ArrayList<>();
            pair.add(new ArrayList<>(List.of(a[i])));
            lastPair.add(a[i]);
            for(int j=i+1; j<a.length;j++) {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(a[i]);
                arr.add(a[j]);
                pair.add(arr);
            }
            pairs.add(pair);
        }

        ArrayList<ArrayList<Integer>> pair = new ArrayList<>();
        pair.add(lastPair);
        pairs.add(pair);
        System.out.println(pairs);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(uppercaseORLowercase(6, "TcaQDL"));
        System.out.println(countSequences(4, new int[]{2, 4, 5, 10}));
    }
}
