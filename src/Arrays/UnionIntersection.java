package Arrays;

import java.util.*;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/find-similarities-between-two-arrays_1229070
 * </metadata>
 * */
public class UnionIntersection {
    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        int intersectionSize = 0;
        int unionSize = 0;
        // Write your code here.
        Set<Integer> set = new HashSet<>(arr1);

        for(int value: arr2) {
            if(set.contains(value)) {
                intersectionSize++;
            }
        }

        unionSize = m+n - intersectionSize;

        ArrayList<Integer> result= new ArrayList<>();
        result.add(intersectionSize);
        result.add(unionSize);
        return result;

    }

    public static void main(String[] a) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(4, 6, 2));
        ArrayList<Integer> result = findSimilarity(arr1, arr2, arr2.size(), arr1.size());
        System.out.println(result);
    }
}
