package Recursions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/*
 * <metadata>
 *   Name:- Subsets,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Subsets.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/subsets/description/,
 *   Date:- 2024-03-30,
 *   Level:- Easy,
 *   Notes:- 1. Iteration 2.Backtracking,
 *   Remarks:- Solve Using Backtracking,
 *   Companies:- Uber:Apple:Adobe:Amazon:Google:Reddit:Twitter:Facebook:Bloomberg:Microsoft,
 * </metadata>
 * */
public class Subsets {

    public static List<List<Integer>> subsetsUsingRecursion(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsUsingIteration(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.emptyList());
        for(int i=0; i< nums.length;i++) {
            result.add(List.of(nums[i]));
            for(int j=i+1; j< nums.length;j++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                result.add(temp);
            }
        }

        if(nums.length > 2) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(subsetsUsingRecursion(new int[]{1, 2, 3}));
    }
}
