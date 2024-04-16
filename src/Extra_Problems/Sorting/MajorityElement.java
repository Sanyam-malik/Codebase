package Extra_Problems.Sorting;
import java.util.*;


/*
 * <metadata>
 *   Name:- Majority Element,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/MajorityElement.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/majority-element/description/,
 *   Date:- 2024-04-16,
 *   Level:- Easy,
 *   Notes:- 1. Using Arrays.sort() </br> 2. Using Map </br> 3. Using <a href="http://lordmaximus.duckdns.org:4500/notes/moore-voting-algorithm">Moore Voting Algorithm</a> </br> <iframe width="560" height="315" src="https://www.youtube.com/embed/nP_ns3uSh80?si=tr2mNrBtERst9EYY" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 *   Companies:- Uber:Adobe:Apple:Amazon:Google:Rubrik:Facebook:Microsoft:Bloomberg,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class MajorityElement {

    public int majorityElementSorting(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    public static int majorityElementMooreVoting(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num: nums) {
            max = Math.max(num, max);
        }
        int[] array = new int[max+1];

        for (int num : nums) {
            array[num]++;
        }

        int count = nums.length/2;
        int iterator = 0;
        for(int i: array) {
            if(i > count) {
                return iterator;
            }
            iterator++;
        }

        return 0;
    }

    public int majorityElementMap(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String args[]) {
        System.out.println(majorityElementMooreVoting(new int[]{3,2,3}));
    }
}
