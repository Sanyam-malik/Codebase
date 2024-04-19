package Sorting;

import java.util.*;


/*
 * <metadata>
 * <name>Arithmetic Subarrays</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ArithmeticSubarrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/arithmetic-subarrays/</url>
 * <date>2024-04-13</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/ErHay1GfIqw?si=wKKzn1hjGWaOLmSO" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <companies>Dunzo:Google:Bloomberg</companies>
 * <remarks>LearnYard Problem:Good Question</remarks>
 * </metadata>
 * */
public class ArithmeticSubArrays {

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        int q = l.length;

        for(int i=0; i< q; i++) {
            int[] newArray = Arrays.copyOfRange(nums, l[i], r[i]+1);
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
        int d = (max - min);
        if(d==0){
            return true;
        }
        if(d % (nums.length-1)!=0){
            return false;
        }
        d = d/(nums.length - 1);

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for(int i=0; i< nums.length-1; i++) {
            int nextElem = min+((i+1)*d);
            if(!set.contains(nextElem)) {
                ans = false;
                break;
            }
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
