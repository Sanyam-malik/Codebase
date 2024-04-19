package Arrays;
import java.util.*;

/*
 * <metadata>
 * <name>Minimum Number Game</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumNoGame.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/minimum-number-game</url>
 * <date>2024-02-23</date>
 * <level>Easy</level>
 * <notes>Sort the array or find the minimum each time until array length reaches then append bob value and then alice value into a new array.</notes>
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
