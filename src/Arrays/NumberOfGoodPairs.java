package Arrays;


import java.util.HashMap;
import java.util.Map;

/*
 * <metadata>
 *   Name:- Number of Good Pairs,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Number_Good_Pairs.png">,
 *   URL:- https://leetcode.com/problems/number-of-good-pairs,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Companies:- Adobe:Amazon:Microsoft,
 *   Notes:- Map to store the count and then no of pairs formula,
 * </metadata>
 * */
public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > 1) {
                // No of Pairs in size n
                result+= ((entry.getValue()) * (entry.getValue()-1))/2;
            }
        }
        return result;
    }


    public static void main(String args[]) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3}));
    }

}
