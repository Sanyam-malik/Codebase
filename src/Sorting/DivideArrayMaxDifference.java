package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * <metadata>
 * <name>Divide Array Into Arrays With Max Difference</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/DivideArray_MaxDiff.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/</url>
 * <date>2024-04-15</date>
 * <level>Medium</level>
 * <notes>Just sort and add to result if nums[i] + nums[i-2] <= k</notes>
 * <remarks>LearnYard Problem:Good Question</remarks>
 * </metadata>
 * */
public class DivideArrayMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> res = new ArrayList<>();
        for (int i = 2; i < nums.length; i += 3) {
            if (nums[i] - nums[i - 2] > k) return new int[][]{};
            res.add(new int[]{nums[i - 2], nums[i - 1], nums[i]});
        }
        return res.toArray(new int[res.size()][]);
    }
}
