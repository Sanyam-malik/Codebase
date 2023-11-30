package Problem_Of_The_Day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/four-divisors_1463975
 * </metadata>
 * */
public class FourDivisors {

    public static int sumFourDivisors(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int sum = 0;
        for(int i=0; i< arr.size(); i++) {
            ArrayList<Integer> divisors = getDivisors(arr.get(i));
            if(divisors.get(0) == 4) {
                sum+=divisors.get(1);
            }
        }
        return sum;
    }

    public static ArrayList<Integer> getDivisors(int no) {
        int[] temp = new int[no];
        Arrays.fill(temp, 0);
        // Two divisors are Permanent which is one and itself
        temp[0] = 1;
        temp[temp.length-1] = 1;

        int divisor = 2;
        while (divisor <= no) {
            if(no%divisor==0) {
                temp[divisor-1] = 1;
            }
            divisor++;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        int count = 0;
        int sum = 0;
        for(int i=0; i< temp.length; i++) {
            if(temp[i] == 1) {
                count++;
                sum+=(i+1);
            }
        }

        arr.add(count);
        arr.add(sum);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(sumFourDivisors(new ArrayList<>(List.of(4, 18, 21)), 3));
    }
}
