package Arrays;



/*
 * <metadata>
 *   Name:- Shortest Unsorted Continuous Subarray,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF84Ni5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/,
 *   Date:- 2024-03-15,
 *   Level:- Medium,
 *   Companies:- Amazon:Microsoft,
 *   Notes:- Solution 1: Find the start index of the where the sorting breaks and also the last index where sorting is breaking and the end - start + 1</br>
 *          Solution 2: Use prefix suffix array,
 *   Remarks:- LearnYard Problem:Good Question,
 * ,
 * </metadata>
 * */
public class ShortestUnSortedSubArray {

    public static int findUnsortedSubarray(int[] nums) {
        int end = -1;
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(max > nums[i]){ // the left value is greater then current value
                end = i; // mark that index with end
            }
            else{
                max = nums[i];
            }
        }

        int start = 0;
        int min = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            if(min < nums[i]){ // the right value is smaller then current value
                start = i; // mark that index with start
            }
            else{
                min = nums[i];
            }
        }
        return end - start + 1;
    }

    public static void main(String args[]) {
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }

}
