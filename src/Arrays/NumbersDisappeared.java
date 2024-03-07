package Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;



/*
 * <metadata>
 *   Name:- Find All Numbers Disappeared in an Array,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF84LnBuZw==&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/,
 *   Date:- 2024-03-07,
 *   Level:- Easy,
 *   Companies:- Apple:Amazon:Facebook:Microsoft,
 *   Notes:- Solution 1 Hint - Use Set or boolean Array</br></br>Solution 2 Hint - Use Cyclic Sort,
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
