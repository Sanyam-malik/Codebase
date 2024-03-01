package Basics;

import java.util.List;

public class CheckIfNumberStartsWithOne {

    public static void main(String args[]) {
        /*int n = 200;
        int nTimes = (int)Math.log10(n);
        while (nTimes > 0) {
            n = n/10;
            nTimes--;
        }*/

        List<Integer> list = List.of(123, 456, 789, 100);
        list = list.stream().filter(n -> {
            int nTimes = (int)Math.log10(n);
            while (nTimes > 0) {
                n = n/10;
                nTimes--;
            }
            return n == 1;
        }).toList();
        System.out.println(list);

    }
}
