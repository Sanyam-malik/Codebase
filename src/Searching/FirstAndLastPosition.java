package Searching;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Find First and Last Position of Element in Sorted Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/FirstLastPosition.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/</url>
 * <date>2024-04-17</date>
 * <level>Medium</level>
 * <notes>No Notes Needed</notes>
 * <companies>Uber:Adobe:Wipro:Amazon:Google:Oracle:VMWare:Airtel:Qualys:Facebook:LinkedIn:Verifone:Bloomberg:ByteDance:Microsoft:Ion Trading:Apptad Inc.:Goldman Sachs:Amadeus Software</companies>
 * <remarks></remarks>
 * </metadata>
 * */
public class FirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int first = firstPosition(nums, target);
        int last = lastPosition(nums, target);
        return new int[]{first, last};
    }

    public static int lastPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int firstPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start<=end) {
            int mid = start+ (end - start)/2;
            if(nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
    }
}
