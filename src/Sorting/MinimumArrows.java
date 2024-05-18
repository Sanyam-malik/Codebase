package Sorting;
import java.util.*;


/*
 * <metadata>
 * <name>Minimum Number of Arrows to Burst Balloons</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumArrows.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/</url>
 * <date>2024-04-12</date>
 * <level>Medium</level>
 * <notes>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/zfcGwzfDNu0?si=Jk7nDbSdi1iJ7Iz9" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
 * </notes>
 * <companies>Google:Facebook:Goldman Sachs</companies>
 * <remarks>Good Question</remarks>
 * </metadata>
 * */
public class MinimumArrows {

    public int findMinArrowShots(int[][] points) {
        // If there are no balloons, no arrows are needed
        if (points.length == 0) return 0;

        // Sort the balloons based on their xstart coordinates
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        // Initialize the number of arrows needed and the end point of the first balloon
        int arrows = 1;
        int end = points[0][1];

        // Iterate through the sorted balloons to find the minimum number of arrows required
        for (int i = 1; i < points.length; i++) {
            // If the current balloon's start point is greater than the previous end point, a new arrow is needed
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            } else {
                // If there is an overlap, update the end point to minimize arrow usage
                end = Math.min(end, points[i][1]);
            }
        }

        return arrows; // Return the minimum number of arrows required to burst all balloons
    }

}
