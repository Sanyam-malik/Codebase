package Basics;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Insert element in already sorted array,
 *   Status:- Completed,
 *   URL:- https://learnyard.com,
 *   Date:- 2024-03-18,
 *   Level:- Easy,
 *   Notes:- Find the index by moving the elem to right if they are greator,
 *   Remarks:- Important Technique:LearnYard Problem,
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
