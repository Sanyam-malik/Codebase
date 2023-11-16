package SearchSortProblems;

public class FindFirstLastIndex {

    public static int search(int[] array, int number, boolean isforward) {
        if(isforward) {
            int start = 0;
            int end = array.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (array[mid] == number) {
                    return mid;
                } else if (array[mid] > number) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        } else {
            int start = array.length - 1;
            int end = 0;

            while (start > end) {
                int mid = start + (end - start) / 2;

                if (array[mid] == number) {
                    return mid;
                } else if (array[mid] > number) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 7, 7, 7, 8, 8, 10};
        int no = 7;
        System.out.println("First: "+search(arr, no, true));
        System.out.println("Second: "+search(arr, no, false));
    }
}
