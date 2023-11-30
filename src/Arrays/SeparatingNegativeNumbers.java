package Arrays;

import java.util.Arrays;

/*
 * <metadata>
 *   Status:- InComplete,
 *   URL:- https://www.codingninjas.com/studio/problems/move-all-negative-numbers-to-beginning-and-positive-to-end_1112620?leftPanelTabValue=PROBLEM
 * </metadata>
 * */
public class SeparatingNegativeNumbers {

    public static void separateNegativeAndPositive(int a[]) {
        for(int i=0; i< a.length; i++) {
            int movement = 0;
            if(a[i] < 0) {
                int temp = a[i];
                movement = i;
                while(movement > 0) {
                    a[movement] =  a[movement+1];
                    movement--;
                }
            }
        }
    }

    public static void main(String[] a) {
        int[] arr = new int[]{1, -4, -2, 5, 3};
        separateNegativeAndPositive(arr);
        System.out.println(Arrays.toString(arr));
    }
}
