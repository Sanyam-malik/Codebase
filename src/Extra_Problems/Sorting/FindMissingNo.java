package Extra_Problems.Sorting;
import java.util.*;
public class FindMissingNo {

    public static int findKthPositive(int[] arr, int k) {
        boolean[] missingArr = new boolean[1001];
        Arrays.fill(missingArr, true);
        for(int i: arr) {
            missingArr[i] = false;
        }

        int count = 1;
        for(int i=1; i< missingArr.length; i++) {
            if(missingArr[i]) {
                if(count == k) return i;
                else {
                    count++;
                }
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11}, 5));
    }

}
