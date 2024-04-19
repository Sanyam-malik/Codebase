package Extra_Problems.Arrays;

/*
 * <metadata>
 * <name>Shuffle the Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Shuffle_Array.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/shuffle-the-array</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Apple:Amazon</companies>
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
