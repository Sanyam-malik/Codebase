package Arrays;

import java.util.Arrays;



/*
 * <metadata>
 *   Name:- Cyclically rotate an array by one,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9000/codebase/CyclicallyRotateArray.png">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1,
 *   Date:- 2024-03-08,
 *   Level:- Easy,
 *   Notes:- Create a new Reverse Array skip upto k(here k=1) and add the original numbers to reverse array and then set all the elem from reverse to original array,
 * </metadata>
 * */
public class CyclicRotate {
    public static void rotate(int arr[], int n){
        int[] reverseArray = reverseArray(arr);
        for(int i=1;i<reverseArray.length;i++) {
            reverseArray[i] = arr[i-1];
        }

        for(int i=0; i< arr.length;i++) {
            arr[i] = reverseArray[i];
        }
    }


    public static int[] reverseArray(int[] arr) {
        int[] temp = new int[arr.length];

        for(int i=0;i< temp.length; i++) {
            int reverseIndex =temp.length - 1 - i;
            temp[i] = arr[reverseIndex];
        }

        return temp;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2};
        rotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
