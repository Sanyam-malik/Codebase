package Arrays;
import java.util.*;

/*
 * <metadata>
 *   Status: InComplete,
 *   URL: https://www.codingninjas.com/studio/problems/triplets-with-given-sum_893028
 * </metadata>
 * */
public class TripletSum {

    public static ArrayList<ArrayList<Integer>> findTriplets(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        Collections.sort(arr);
        for(int i=0; i< n;i++) {
            int start = i+1;
            int end = n-1;

            while(start<end) {
                int sum = arr.get(i) + arr.get(start) + arr.get(end);
                if(sum == 0) {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(arr.get(i));
                    temp.add(arr.get(start));
                    temp.add(arr.get(end));

                    output.add(temp);
                    start++;
                    end--;
                }
                else if(sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return output;
    }

    public static void main(String[] a) {
        System.out.println(findTriplets(new ArrayList<>(List.of(1, 2, 3, -1, -2, -3)), 6));
    }
}
