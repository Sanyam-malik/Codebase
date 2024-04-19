package Extra_Problems.Sorting;

import java.util.*;

/*
 * <metadata>
 * <name>Intersection of Two Arrays II</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArraysII.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/intersection-of-two-arrays-ii/description/</url>
 * <date>2024-04-16</date>
 * <level>Easy</level>
 * <notes>1. Use HashMap </br> 2. Use Arrays as Map</notes>
 * <remarks>Kunal Kushwaha</remarks>
 * <companies>Yahoo:Adobe:Amazon:Facebook:Bloomberg</companies>
 * </metadata>
 * */
public class IntersectionOfArraysII {

    public int[] intersectOptimisedToHell(int[] nums1, int[] nums2) {
        int map[]=new int[1001];
        int res[]=new int[1001];
        int count=0;
        for(int i:nums1) {
            map[i]++;
        }
        for(int i:nums2){
            if(map[i]>0){
                res[count++]=i;
                map[i]--;
            }
        }
        return Arrays.copyOfRange(res,0,count);
    }

    public int[] intersectWithMapOptimised(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<>();

        for(int i: nums1) {
            map1.put(i, map1.getOrDefault(i, 0)+1);
        }

        for(int i: nums2) {
            if(map1.containsKey(i) && map1.get(i) > 0) {
                map1.put(i, map1.get(i)-1);
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] intersectWithMap(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for(int i: nums1) {
            map1.put(i, map1.getOrDefault(i, 0)+1);
            map2.put(i, 0);
        }

        for(int i: nums2) {
            map2.put(i, map2.getOrDefault(i, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(Integer key: map1.keySet()) {
            int val1 = map1.get(key);
            int val2 = map2.get(key);
            if(val1 != 0 && val2 !=0) {
                int min = Math.min(val1, val2);
                for(int i=0; i< min;i++) {
                    list.add(key);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
