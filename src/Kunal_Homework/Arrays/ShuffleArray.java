package Kunal_Homework.Arrays;

/*
 * <metadata>
 *   Name:- Shuffle the Array,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Shuffle_Array.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/shuffle-the-array,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Apple:Amazon,
 * </metadata>
 * */
public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int temp[] = new int[nums.length];
        int k = 0;
        for(int i=0; i< nums.length/2; i++) {
            temp[k++] = nums[i];
            temp[k++] = nums[i+n];
        }
        return temp;
    }

}
