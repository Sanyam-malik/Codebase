package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class MostWaterContainer {

    public static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left<=right) {
            int a = Math.min(height[left],height[right]);
            int b = right - left;
            result = Math.max(result, a*b);
            if(height[left]< height[right]) {
                left++;
            } else if(height[left]> height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return result;


    }

    public static void main(String[] a) {
        System.out.println(maxArea(new int[]{4, 3, 2, 1, 4}));
    }
}
