package Arrays;


import java.util.HashMap;
import java.util.Map;

/*
 * <metadata>
 *   Name:- Count Number of Nice Subarrays,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF83My5wbmc=&version_id=null">,
 *   Status:- Try Again,
 *   URL:- https://leetcode.com/problems/count-number-of-nice-subarrays/description,
 *   Date:- 2024-03-11,
 *   Level:- Medium,
 *   Remarks:- Needs Practice Related to This Problem,
 *   Notes:- Solution 1- Using list and two for loops</br></br>
 *      Solution 2- </br><iframe width="560" height="315" src="https://www.youtube.com/embed/atUJS7ArOY0?si=cez2IYUKJf0O1DNe" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe></br>
 *      Solution 3- </br><iframe width="560" height="315" src="https://www.youtube.com/embed/zm460v4n2Ic?si=xyJq-UZ6Z_1Ct5CT" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>,
 * </metadata>
 * */
public class CountNiceSubArrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        return countKOddWindowPrefixSum(nums, k);
    }


    static int countOddSlidingWindow(int []arr, int k ){
        int n = arr.length;
        int si = 0; int sum = 0;
        int count = 0;
        for(int cur = 0; cur<n; cur++){
            if(arr[cur] % 2 != 0) sum++;
            if(sum <= k) count += cur - si + 1;
            while(si<=cur && sum > k){
                if(arr[si]%2!=0){
                    sum--;
                }
                si++;
                if(sum <= k) count += cur - si + 1;
            }
        }
        return count;
    }


    static int countKOddWindowPrefixSum(int []arr, int k){
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int ans = 0;
        int si = 0;
        for(int cur = 0; cur<n; cur++){
            if(arr[cur] % 2 != 0){
                sum++;
            }
            if(sum == k){
                ans++;
            }
            int req = sum - k;
            if(mp.containsKey(req)){
                ans += mp.get(req);
            }
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1}, 1));
    }
}
