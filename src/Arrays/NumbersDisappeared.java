package Arrays;

import java.util.*;

/*
 * <metadata>
 * <name>Find All Numbers Disappeared in an Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/NumbersDisappeared.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/</url>
 * <date>2024-06-01</date>
 * <level>Easy</level>
 * <companies>Apple:Amazon:Facebook:Microsoft</companies>
 * <notes>Solution 1 Hint - Use Set or boolean Array</br></br>Solution 2 Hint - Use Cyclic Sort</notes>
 * </metadata>
 * */
public class NumbersDisappeared {

    public static List<Integer> findDisappearedNumbersSorting(int[] nums) {
        int i = 0;

        // Cyclic sort to place numbers in their correct positions
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                // Swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Find all indices where the number is not in the correct position
        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                disappearedNumbers.add(j + 1);
            }
        }

        return disappearedNumbers;
    }

    public static List<Integer> findDisappearedNumbersMap(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            set.add(n);
        }

        List<Integer> result = new ArrayList<>();
        for(int i=1;i <= nums.length; i++) {
            if(!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> findDisappearedNumbersMapAlternate(int[] nums) {
        boolean[] isAvailable = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            isAvailable[nums[i]-1] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<isAvailable.length;i++){
            if(!isAvailable[i]){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbersSorting(new int[]{4,3,2,7,8,2,3,1}));
    }
}
