package Sorting;
import java.util.Arrays;


/*
 * <metadata>
 *   Name:- Maximum Units on a Truck,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/MaximumUnitsTruck.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/maximum-units-on-a-truck/description/,
 *   Date:- 2024-04-13,
 *   Level:- Easy,
 *   Notes:- Sort the 2D Descending of No of units per box using Custom Comparator,
 *   Companies:- Amazon:JPMorgan:LinkedIn,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class MaximumUnitsTruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int ans = 0;
        int remainingSize = truckSize;
        for (int[] boxType : boxTypes) {
            int boxes = boxType[0];
            int units_per_boxes = boxType[1];
            if (boxes > remainingSize) {
                ans += remainingSize * units_per_boxes;
                break;
            } else {
                remainingSize -= boxes;
                ans += boxes * units_per_boxes;
            }
        }
        return ans;
    }
}
