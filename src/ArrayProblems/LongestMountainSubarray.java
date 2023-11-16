package ArrayProblems;

public class LongestMountainSubarray {
    public static void main(String[] args) {
        int[] arr = new int[]{999999984, 999999998, 999999992, 999999998, 999999984, 999999995, 999999994, 999999983, 999999983, 999999986, 999999991, 999999981, 999999989, 999999984, 999999986, 999999981, 999999998, 999999987, 999999980, 999999994, 999999997, 999999998, 999999999, 999999982, 999999984, 999999995, 1000000000, 999999985, 999999981, 999999980, 999999987, 999999983, 999999992, 999999991, 999999980, 999999994, 999999986, 999999999, 999999995, 999999987, 999999996, 999999985, 999999989, 999999983, 999999983, 999999982, 999999998, 999999981, 999999987, 999999993 };

        int[] result = findLongestMountainSubarray(arr);

        System.out.println("Longest Mountain Subarray:");
        for (int i = result[0]; i <= result[1]; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] findLongestMountainSubarray(int[] arr) {
        int n = arr.length;
        int[] result = {-1, -1};
        int maxLength = 0;

        int i = 1;

        while (i < n - 1) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                // Expand left
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Expand right
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int currentLength = right - left + 1;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    result[0] = left;
                    result[1] = right;
                }

                i = right + 1;
            } else {
                i++;
            }
        }

        return result;
    }
}


