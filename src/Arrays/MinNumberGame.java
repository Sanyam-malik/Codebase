package Arrays;
import java.util.*;

/*
 * <metadata>
 *   Name:- Minimum Number Game,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumNoGame.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/minimum-number-game,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- Sort the array or find the minimum each time until array length reaches then append bob value and then alice value into a new array.,
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
