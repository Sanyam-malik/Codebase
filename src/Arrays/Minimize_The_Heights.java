package Arrays;

import java.util.Arrays;


/*
 * <metadata>
 *   Name:- Minimize the Heights II,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Minimize_the_Heights_II.png">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1,
 *   Date:- 2024-03-28,
 *   Level:- Medium,
 *   Notes:- Simple find smallest after modification and find the maximum and calculate the minimum answer of the values,
 * </metadata>
 * */
public class Minimize_The_Heights {

    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int mini = arr[0]+k;
        int maxim = arr[n-1]-k;
        int ans = arr[n-1]-arr[0];

        int mi = 0, ma = 0;

        for(int i=1 ; i<n ; i++){
            if(arr[i]-k<0) continue;

            mi = Math.min(arr[i]-k,mini);
            ma = Math.max(arr[i-1]+k,maxim);
            ans = Math.min(ans , ma-mi);
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(getMinDiff(new int[]{1, 8, 10, 6, 4, 6, 9, 1}, 8, 7));
    }
}
