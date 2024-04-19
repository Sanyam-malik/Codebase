package Recursions;


/*
 * <metadata>
 * <name>Searching of number</name>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/searching-a-number0324/1</url>
 * <date>2024-03-15</date>
 * <level>Easy</level>
 * </metadata>
 * */
public class SearchANo {

    public static int searchHelper(int arr[], int st, int en, int k) {
        if(st > en)
            return -1;

        if(st == en)
            return arr[st] == k? st : -1;

        int mid = (st + en)/2;
        int firstHalf = searchHelper(arr, st, mid, k);

        if(firstHalf != -1)
            return firstHalf;

        return searchHelper(arr, mid + 1, en, k);
    }

    public static int search(int n, int k, int[] arr) {
        int ans = searchHelper(arr, 0, n - 1, k);
        return ans == -1? ans : ans + 1; // convert 0-based to 1-based.
    }


    public static void main(String args[]) {
        System.out.println(search(5, 98, new int[]{1, 22, 57, 47, 34, 18, 66}));
    }
}
