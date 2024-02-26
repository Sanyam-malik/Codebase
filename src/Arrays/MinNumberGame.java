package Arrays;
import java.util.*;

/*
 * <metadata>
 *   Name:- Minimum Number Game,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/minimum-number-game,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class MinNumberGame {

    public int[] numberGame(int[] nums) {
        int[] temp = new int[nums.length];
        Arrays.sort(nums);
        int index = 0;
        for(int aliceIndex=0; aliceIndex < nums.length; aliceIndex+=2) {
            int bobIndex = aliceIndex+1;
            temp[index++] = nums[bobIndex];
            temp[index++] = nums[aliceIndex];
        }
        return temp;

    }

}
