package Arrays;


import java.util.ArrayList;
import java.util.List;

/*
 * <metadata>
 *   Name:- Max of all elements except one,
 *   Description:- Given a array find the max of all elements except the ith element from the queries,
 *   Status:- Completed,
 *   URL:- https://learnyard.com/,
 *   Date:- 2024-03-12,
 *   Level:- Easy,
 *   Notes:- Solution 1: Find largest and second largest element</br></br>Solution 2: Find Prefix and Suffix of all elements,
 *   Remarks:- LearnYard Problem
 * </metadata>
 * */
public class MaxOfAllElementsExcept {

    public List<Integer> findMaxLargestSecondLargest(int[] arr, int[] queries) {
        List<Integer> list = new ArrayList<>();
        int largest = Integer.MIN_VALUE;
        int secondLargest = arr[0];
        for(int a: arr) {
            if(largest < a) {
                largest = a;
                secondLargest = largest;
            }
        }

        for(int index: queries) {
            if(arr[index] == largest) {
                list.add(secondLargest);
            } else {
                list.add(largest);
            }
        }
        return list;
    }


    public List<Integer> findMaxPrefixSuffix(int[] arr, int[] queries) {
        List<Integer> list = new ArrayList<>();
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];

        prefix[0] = arr[0];
        suffix[arr.length-1] = arr[arr.length-1];
        for(int i=1; i< arr.length; i++) {
            prefix[i] = arr[i] + arr[i-1];
            suffix[arr.length-1-i] = arr[arr.length-1-i] + arr[arr.length-2-i];
        }

        for(int index: queries) {
            list.add(Math.max(prefix[index], suffix[index]));
        }
        return list;
    }

}
