package ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/triangle-with-the-largest-perimeter_1463974
 * </metadata>
 * */
public class LargestPerimeterTraingle {
        public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
            Collections.sort(arr, Collections.reverseOrder());

            int maxi = 0;
            for(int i=0; i< n-2; i++) {
                if(arr.get(i) < arr.get(i+1)+arr.get(i+2)) {
                    maxi = Math.max(maxi, arr.get(i) + arr.get(i+1)+arr.get(i+2));
                }
            }
            return maxi;
        }

    public static void main(String[] a) {
        System.out.println(maxPerimeterTriangle(new ArrayList<>(List.of(2, 2, 3)), 3));
    }
}
