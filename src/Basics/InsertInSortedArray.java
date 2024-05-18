package Basics;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Insert element in already sorted array</name>
 * <status>Completed</status>
 * <url>https://learnyard.com</url>
 * <date>2024-03-18</date>
 * <level>Easy</level>
 * <notes>Find the index by moving the elem to right if they are greator</notes>
 * <remarks></remarks>
 * </metadata>
 * */
public class InsertInSortedArray {

    public static int[] insert(int[] arr, int no) {
        int i;
        for(i = arr.length-2; i >=0; i--) {
            if(arr[i] > no) {
                arr[i+1] = arr[i];
            } else {
                break;
            }
        }
        arr[i+1] = no;
        return arr;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(insert(new int[]{1, 4, 5, 6, 8, 10, 0}, 9)));
    }
}
