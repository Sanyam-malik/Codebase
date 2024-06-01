package Arrays;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Cyclically rotate an array by one</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/CyclicallyRotateArray.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1</url>
 * <date>2024-06-01</date>
 * <level>Easy</level>
 * <notes>Create a new Reverse Array skip upto k(here k=1) and add the original numbers to reverse array and then set all the elem from reverse to original array</notes>
 * </metadata>
 * */
public class CyclicRotateOne {

    public static void rotate(int arr[], int n) {
        int k = 1;
        cyclicRotate(arr, k);
    }

    public static void cyclicRotate(int[] arr, int k) {
        reverse(arr, 0, arr.length-1);
        reverse(arr, k, arr.length-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 4, 2, 1, 3};
        rotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
