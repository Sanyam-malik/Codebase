package Sorting;
import java.util.Arrays;


/*
 * <metadata>
 * <name>Maximum Units on a Truck</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MaximumUnitsTruck.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-units-on-a-truck/description/</url>
 * <date>2024-04-13</date>
 * <level>Easy</level>
 * <notes>Sort the 2D Descending of No of units per box using Custom Comparator</notes>
 * <companies>Amazon:JPMorgan:LinkedIn</companies>
 * <remarks></remarks>
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
