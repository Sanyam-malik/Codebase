package Kunal_Homework.Arrays;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Find N Unique Integers Sum up to Zero,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero,
 *   Date:- 2024-02-21,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class UniqueNos {

    public static int[] sumZero(int n) {
        int []ans = new int[n];
        int left=0;
        int right=n-1;
        int start=1;
            while(left<right) {
                ans[left++]=start;
                ans[right--]=-start;
                start++;
            }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
}
