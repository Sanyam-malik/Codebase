package Search__Sort;

public class OrderAgnosticSearch {
    public static int search(int[] array, int number) {
        int start = 0;
        int end = array.length - 1;
        boolean isForward = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(array[mid] == number) {
                return mid;
            }

            else if(number < array[mid]) {
                if(isForward) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if(isForward) {
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 5, 9, 14, 16, 18};
        int[] array2 = new int[]{20, 18, 16, 14, 12, 10};
        int number = 18;
        System.out.println(search(array2, number));
    }
}
