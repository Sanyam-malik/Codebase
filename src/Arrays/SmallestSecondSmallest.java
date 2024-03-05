package Arrays;

/*
 * <metadata>
 *   Name:- Find the smallest and second-smallest element in an array,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class SmallestSecondSmallest {

    public long[] minAnd2ndMin(long arr[], long n)
    {
        long min_element = (int) Integer.MAX_VALUE;
        long sec_min = (int) Integer.MAX_VALUE;

        for(int i = 0; i < n; ++i) {
            if(arr[i] < min_element) {
                sec_min = min_element;
                min_element = arr[i];
            }
            else if(arr[i] != min_element && arr[i] < sec_min) {
                sec_min = arr[i];
            }
        }

        if(sec_min == Integer.MAX_VALUE) {
            min_element = -1;
            sec_min = -1;
        }

        long ans[] = {min_element, sec_min};

        return ans;
    }
}
