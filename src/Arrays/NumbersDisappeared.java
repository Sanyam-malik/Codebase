package Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;



/*
 * <metadata>
 * <name>Find All Numbers Disappeared in an Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/NumbersDisappeared.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/</url>
 * <date>2024-03-07</date>
 * <level>Easy</level>
 * <companies>Apple:Amazon:Facebook:Microsoft</companies>
 * <notes>Solution 1 Hint - Use Set or boolean Array</br></br>Solution 2 Hint - Use Cyclic Sort</notes>
 * </metadata>
 * */
public class NumbersDisappeared {

    public List<Integer> findDisappearedNumbersUsingBooleanArray(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] a = new boolean[nums.length+1];
        for(int i = 0 ; i < nums.length; i++){
            a[nums[i]] = true;
        }
        for(int i = 1 ; i < a.length; i++){
            if(!a[i]){
                res.add(i);
            }
        }
        return res;
    }

    public List<Integer> findDisappearedNumbersUsingSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int a: arr) {
            set.add(a);
        }

        for(int i=0; i< arr.length; i++) {
            int elem = i+1;
            if(!set.contains(elem)) {
                list.add(elem);
            }
        }
        return list;
    }

    public List<Integer> findDisappearedNumbersCyclicSort(int[] arr) {
        int i=0;
        while(i != arr.length) {
            if (arr[i] != i + 1) {  // Element is not in its correct position
                int correctIndex = arr[i] - 1;
                if (correctIndex < arr.length && arr[i] != arr[correctIndex]) {
                    // Swap the elements
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }

        }

        List<Integer> list = new ArrayList<>();
        for(i=0; i< arr.length; i++) {
            int elem = i+1;
            if(elem != arr[i]) {
                list.add(elem);
            }
        }

        return list;
    }


}
