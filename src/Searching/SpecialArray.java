package Searching;

/*
 * <metadata>
 * <name>Special Array With X Elements Greater Than or Equal X</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/SpecialArray.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description</url>
 * <date>2024-05-27</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks>Good Question</remarks>
 * </metadata>
 * */
public class SpecialArray {

    public int specialArray(int[] nums) {
        int start = 0;
        int end = nums.length;

        while(start<=end){
            int mid = start+ (end-start)/2;
            int ans = count(nums, mid);

            if(ans == mid) return mid;
            else if(ans>mid)    start = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    int count(int []nums, int target){
        int ans = 0;
        for(int num : nums){
            if(num>=target) ans++;

        }
        return ans;
    }
}
