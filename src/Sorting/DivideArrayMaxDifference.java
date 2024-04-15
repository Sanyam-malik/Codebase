package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * <metadata>
 *   Name:- Divide Array Into Arrays With Max Difference,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/DivideArray_MaxDiff.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/,
 *   Date:- 2024-04-15,
 *   Level:- Medium,
 *   Notes:- Just sort and add to result if nums[i] + nums[i-2] <= k,
 *   Remarks:- LearnYard Problem:Good Question,
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
