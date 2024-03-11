package Arrays;


/*
 * <metadata>
 *   Name:- Count Number of Nice Subarrays,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF83My5wbmc=&version_id=null">,
 *   Status:- InComplete,
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
        int result = 0;
        // convert to subarray with sum equal to k
        int[] sub = new int[nums.length];
        for(int i=0; i< nums.length;i++) {
            if(nums[i] % 2==0) {
                sub[i]=0;
            } else {
                sub[i]=1;
            }
        }

        // saving running sums
        int[] res = new int[sub.length];
        res[0] = sub[0];
        for(int i=1; i< sub.length;i++) {
            res[i] += res[i-1];
        }

        for()

        return result;
    }

    public static void main(String args[]) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1}, 1));
    }
}
