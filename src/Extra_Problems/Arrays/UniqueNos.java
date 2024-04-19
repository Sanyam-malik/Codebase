package Extra_Problems.Arrays;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Find N Unique Integers Sum up to Zero</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Unique_Numbers_Zero.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero</url>
 * <date>2024-02-21</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Microsoft</companies>
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
