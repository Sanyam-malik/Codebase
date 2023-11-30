package Arrays;

import java.util.*;

/*
* <metadata>
*   Status: InComplete,
*   URL: https://www.codingninjas.com/studio/problems/power-set_1062667,
*   Notes: Sorting of Sets Are Pending
* </metadata>
* */
public class PowerSet {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        ArrayList<ArrayList<Integer>> powerSet = pwset(input);
    }

    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        generatePowerSet(arr, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generatePowerSet(ArrayList<Integer> arr, int index, ArrayList<Integer> currentSet, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.size()) {
            result.add(new ArrayList<>(currentSet));
            return;
        }

        // Include the current element
        currentSet.add(arr.get(index));
        generatePowerSet(arr, index + 1, currentSet, result);

        // Exclude the current element
        currentSet.remove(currentSet.size() - 1);
        generatePowerSet(arr, index + 1, currentSet, result);
    }
}
