package Arrays;

import java.util.Arrays;

public class MinMax {

    public static void main(String[] args){
        int[] array = new int[]{18, 12, -7, 3, 14, 28};
        System.out.println("Minimum No in Array: "+min(array));
        System.out.println("Maximum No in Array: "+max(array));
    }

    public static int min(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for(int val: array) {
            minValue = Math.min(minValue, val);
        }
        return  minValue;
    }

    public static int max(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for(int val: array) {
            maxValue = Math.max(maxValue, val);
        }
        return  maxValue;
    }
}
