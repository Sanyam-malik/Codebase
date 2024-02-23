package Arrays;
import java.util.Arrays;


/*
 * <metadata>
 *   Name:- Find minimum and maximum element in an array,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class MinMaxInArray {
    static class Pair {
        long first, second;
        public Pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }

    Pair getMinMax(long a[], long n) {
        Arrays.sort(a);
        return new Pair((int) a[0], (int) a[(int) (n - 1)]);
    }

}
