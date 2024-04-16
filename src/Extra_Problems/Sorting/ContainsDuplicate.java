package Extra_Problems.Sorting;
import java.util.*;

/*
 * <metadata>
 *   Name:- Contains Duplicate,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/ContainsDuplicate.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/contains-duplicate/,
 *   Date:- 2024-04-16,
 *   Level:- Easy,
 *   Notes:- 1. Using Arrays.sort() </br> 2. Using Sets </br>,
 *   Companies:- TCS:Uber:Adobe:Apple:Yahoo:Amazon:Google:Microsoft:Bloomberg,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class ContainsDuplicate {

    public boolean containsDuplicateSet(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int i = 0; i < nums.length ; i++){
            if(numsSet.contains(nums[i])){
                return true;
            }
            numsSet.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);
        int prevElem = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(prevElem == nums[i]) return true;
            prevElem = nums[i];
        }
        return false;
    }

}
