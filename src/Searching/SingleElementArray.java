package Searching;


/*
 * <metadata>
 *   Name:- Single Element in a Sorted Array,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/SingleElementArray.png">,
 *   URL:- https://leetcode.com/problems/single-element-in-a-sorted-array/description/,
 *   Date:- 2024-04-19,
 *   Level:- Medium,
 *   Companies:- Apple:Amazon:Google:Nvidia:Facebook:Microsoft,
 *   Notes:- See The code </br> <iframe width="560" height="315" src="https://www.youtube.com/embed/AZOmHuHadxQ?si=f9LxViORaaSk2aET" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 *   Remarks:- LearnYard Problem:Good Question
 * </metadata>
 * */
public class SingleElementArray {

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 2;
            }
        }
        return nums[start];
    }

    public static void main(String args[]) {
        System.out.println(singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }


}
