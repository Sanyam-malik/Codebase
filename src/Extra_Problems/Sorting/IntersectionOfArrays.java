package Extra_Problems.Sorting;
import java.util.*;

/*
 * <metadata>
 * <name>Intersection of Two Arrays</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/intersection-of-two-arrays/description/</url>
 * <date>2024-04-16</date>
 * <level>Easy</level>
 * <notes>1. Use Sets </br> 2. Use Two Pointers Approach</notes>
 * <remarks></remarks>
 * <companies>Apple:Adobe:Amazon:Google:Facebook:JPMorgan:Microsoft:Bloomberg</companies>
 * </metadata>
 * */
public class IntersectionOfArrays {

    public int[] intersectionWithTwoPointers(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        List<Integer> l = new ArrayList<>();

        int i=0;int j=0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]==nums2[j]){
                if(!l.contains(nums1[i])) { l.add(nums1[i]);}

                i++;j++;}
            else if(nums1[i]<nums2[j]){i++;}
            else{j++;}
        }
        int [] res = new int[l.size()];
        for( i =0; i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;


    }


    public int[] intersectionwithSets(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> list = new HashSet();
        for(int i: nums1) {
            set.add(i);
        }

        for(int i: nums2) {
            if(set.contains(i)) list.add(i);
        }

        List<Integer> myList = new ArrayList<>(list);
        int[] result = new int[myList.size()];
        for(int i=0; i< result.length;i++) {
            result[i]=myList.get(i);
        }
        return result;
    }
}