package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {

    public static void reverseArray(char[] a) {
        int start = 0;
        int end = a.length - 1;

        while(start<end) {
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] a) {
        String s = "hello";
        char[] arr = s.toCharArray();
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
