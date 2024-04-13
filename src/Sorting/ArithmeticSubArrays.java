package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * <metadata>
 *   Name:- Arithmetic Subarrays,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/ArithmeticSubarrays.png">,
 *   Status:- Try Again,
 *   URL:- https://leetcode.com/problems/arithmetic-subarrays/,
 *   Date:- 2024-04-13,
 *   Level:- Medium,
 *   Notes:- <iframe width="560" height="315" src="https://www.youtube.com/embed/ErHay1GfIqw?si=wKKzn1hjGWaOLmSO" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 *   Companies:- Dunzo:Google:Bloomberg,
 *   Remarks:- LearnYard Problem:Good Question,
 * </metadata>
 * */
public class ArithmeticSubArrays {

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        int q = l.length;

        for(int i=0; i< q; i++) {
            int[] newArray = Arrays.copyOfRange(nums, l[i], r[i]+1);
            // Using Arrays.sort()
            // list.add(isArithmeticSubArrayWithSort(newArray));
            list.add(isArithmeticSubArrayWithoutSort(newArray));
        }
        return list;
    }

    public static boolean isArithmeticSubArrayWithoutSort(int[] nums) {
        boolean ans = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int d = (max - min)/(nums.length - 1);
        for(int i=1; i< nums.length; i++) {
            int diff = nums[i]  - nums[i-1];
            if(diff != d) { ans = false; break; }
        }
        return ans;
    }

    public static boolean isArithmeticSubArrayWithSort(int[] nums) {
        Arrays.sort(nums);
        boolean ans = true;
        int prevAns = -1;
        int start = 0;
        int end = nums.length - 1;
        for(int i=start; i<end; i++) {
            int currElem = nums[i];
            int nextElem = nums[i+1];

            int diff = Math.abs(nextElem - currElem);
            if(prevAns != -1 && diff != prevAns) {
                ans = false;
                break;
            }
            prevAns = diff;
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{4,6,5,9,3,7};
        int[] l = new int[]{0,0,2};
        int[] r = new int[]{2,3,5};
        System.out.println(checkArithmeticSubarrays(nums, l, r));
    }
}
