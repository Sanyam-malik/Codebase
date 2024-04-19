package Arrays;
import java.util.Arrays;


/*
 * <metadata>
 * <name>Find minimum and maximum element in an array</name>
 * <status>Completed</status>
 * <description>Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.</br></br>       <img src="http://lordmaximus.duckdns.org:9000/codebase/MinMaxInArray.png"></description>
 * <url>https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1</url>
 * <date>2024-02-23</date>
 * <level>Easy</level>
 * <notes>Solution 1 - Two Four Loops for Min and Max or convert into single one O(n)?</br></br>            Solution 2 - Sort Ascending O(n log n)?</notes>
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
