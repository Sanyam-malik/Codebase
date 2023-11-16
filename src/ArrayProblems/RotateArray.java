package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {

    public static void CyclicRotate(ArrayList<Integer> arr, int k, int n) {
        for (int i = 0; i < k; i++) {
            int temp =arr.get(0);
            for (int j = 0; j < n - 1; j++) {
                arr.set(j, arr.get(j+1));
            }
            arr.set(n - 1, temp);
        }
    }

    public static void main(String[] a) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        CyclicRotate(arr1, 3, arr1.size());
        System.out.println(arr1);
    }
}
