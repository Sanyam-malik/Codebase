# Moore Voting Algorithm

The Moore Voting Algorithm is a space-efficient algorithm used to find the majority element in an array or sequence. It works by selecting a candidate element and incrementing its count whenever it appears, and decrementing the count when a different element appears. If the count becomes zero, a new candidate is selected.

## Background

The Moore Voting Algorithm is based on the observation that if there is a majority element in the array (an element that appears more than n/2 times, where n is the size of the array), it will always remain as the majority element even after cancelling out other elements.

## How It Works

The basic idea behind the Moore Voting Algorithm is to select a candidate element and maintain a count of its occurrences. If the current element is the same as the candidate, the count is incremented; otherwise, the count is decremented. If the count becomes zero, a new candidate is selected. At the end of the process, the selected candidate is verified to ensure it is the majority element.

## Example

Here's an example of the Moore Voting Algorithm:

### Problem: Given an array, find the majority element (element that appears more than n/2 times).

```java
public class MooreVotingExample {
    public static int majorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Verify the candidate is the majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return (count > arr.length / 2) ? candidate : -1; // Majority element found or not
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majority = majorityElement(arr);
        if (majority != -1) {
            System.out.println("Majority element: " + majority); // Output: Majority element: 4
        } else {
            System.out.println("No majority element found");
        }
    }
}
```

## Applications

The Moore Voting Algorithm is commonly used in scenarios where finding the majority element is required, such as:

 - Identifying popular voting choices in elections or surveys.
 - Detecting frequent elements in data streams or sequences.
 - Solving problems related to leader election or dominance in arrays.

## Complexity

The Moore Voting Algorithm has a time complexity of O(n) and a space complexity of O(1), making it an efficient and space-efficient solution for finding the majority element in an array.

## Usage Guidelines

 - Ensure the input array contains a majority element (if one exists) before applying the Moore Voting Algorithm.
 - Verify the selected candidate as the majority element by counting its occurrences after the initial pass.
 - Handle edge cases such as arrays with no majority element or empty arrays.