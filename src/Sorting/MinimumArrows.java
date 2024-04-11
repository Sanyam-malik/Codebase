package Sorting;
import java.util.*;


/*
 * <metadata>
 *   Name:- Minimum Number of Arrows to Burst Balloons,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumArrows.png">,
 *   Status:- Try Again,
 *   URL:- https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/,
 *   Date:- 2024-04-12,
 *   Level:- Medium,
 *   Notes:- <iframe width="560" height="315" src="https://www.youtube.com/embed/fvBhjAp0j9c?si=FKM0z0wTBIDBDIC5" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 *   Companies:- Google:Facebook:Goldman Sachs,
 *   Remarks:- LearnYard Problem:Good Question,
 * </metadata>
 * */
public class MinimumArrows {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int y = points[0][1];
        int ans = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > y) {
                ans++;
                y = points[i][1];
            }
            y = Math.min(points[i][1], y);
        }
        return ans;
    }

}
