package KunalHomework.Arrays;


/*
 * <metadata>
 *   Name:- How Many Numbers Are Smaller Than the Current Number,
 *   Status:- Needs Improvement,
 *   URL:- https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class HowManyNumbers {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int temp[] = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            int sum = 0;
            for(int j=0; j<nums.length;j++) {
                if(nums[j] < nums[i]) {
                    sum++;
                }
            }
            temp[i] = sum;
        }
        return temp;
    }

}
