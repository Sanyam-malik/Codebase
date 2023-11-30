package Search__Sort;

public class SmallestNoGreaterThanTarget {
    public static int floor(int[] array, int number) {
        int start = 0;
        int end = array.length;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(array[mid] > number) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return array[start];
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 5, 9, 14, 16, 18};
        int number = 14;
        System.out.println(floor(array, number));
    }
}
