package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/reverse-the-array_1262298
 * </metadata>
 * */
public class ReverseArray
{
    /*
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<=m;i++) {
            a.add(arr.get(i));
        }

        for(int i=arr.size()-1; i>m; i--) {
            a.add(arr.get(i));
        }

        arr.clear();
        arr.addAll(a);
    }*/

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        int start = m+1;
        int end = arr.size() - 1;

        while(start<end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] a) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        reverseArray(al, 3);
        System.out.println(al);
    }
}