package Sorting;
import java.util.*;

/*
 * <metadata>
 *   Name:- Array Partition,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/ArrayPartition.png">,
 *   URL:- https://leetcode.com/problems/array-partition/description/,
 *   Date:- 2024-04-17,
 *   Level:- Easy,
 *   Companies:- Yahoo:Adobe:Amazon,
 *   Notes:- Use Arrays.sort and add the nums[i] where i will be incremented by 2,
 * </metadata>
 * */
public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i = i+2)
        {
            sum += nums[i];
        }

        return sum;
    }

}
