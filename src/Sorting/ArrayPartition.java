package Sorting;
import java.util.*;

/*
 * <metadata>
 * <name>Array Partition</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Array Partition.png"></description>
 * <url>https://leetcode.com/problems/array-partition/description/</url>
 * <date>2024-04-17</date>
 * <level>Easy</level>
 * <companies>Yahoo:Adobe:Amazon</companies>
 * <notes>Use Arrays.sort and add the nums[i] where i will be incremented by 2</notes>
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
