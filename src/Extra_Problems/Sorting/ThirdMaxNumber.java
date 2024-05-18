package Extra_Problems.Sorting;
import java.util.*;



/*
 * <metadata>
 * <name>Third Maximum Number</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ThirdMaxNumber.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/third-maximum-number/description/</url>
 * <date>2024-04-16</date>
 * <level>Easy</level>
 * <notes>1. Using Set and Sort </br> 2. Using Direct Approach</notes>
 * <remarks></remarks>
 * <companies>Apple:Amazon:Google</companies>
 * </metadata>
 * */
public class ThirdMaxNumber {

    public static int thirdMaxUsingSet(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i:nums) {
            set.add(i);
        }

        List<Integer> result = new ArrayList(set);
        Collections.sort(result, (a, b) -> Integer.compare(b, a));

        if(result.size() < 3) {
            return result.get(0);
        }
        return result.get(2);
    }

    public static int thirdMaxUsingArrays(int[] nums) {
        Arrays.sort(nums);
        int prev = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< nums.length;i++) {
            if(prev != nums[i]){
                result.add(nums[i]);
                prev = nums[i];
            }
        }
        if(result.size() < 3) {
            return result.get(result.size()-1);
        } else {
            return result.get(result.size()-3);
        }
    }

    public int thirdMaxDirectApproach(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }

    public static void main(String args[]) {
        System.out.println(thirdMaxUsingArrays(new int[]{-1, 2, 3}));
    }
}
