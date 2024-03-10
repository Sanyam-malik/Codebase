package Kunal_Homework.Arrays;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Find N Unique Integers Sum up to Zero,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF83MC5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero,
 *   Date:- 2024-02-21,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Microsoft,
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
