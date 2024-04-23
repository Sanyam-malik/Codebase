package Searching;
import java.util.*;
/*
 * <metadata>
 * <name>Minimum Time to Complete Trips</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumSpeedToArrive.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>https://learnyard.com</url>
 * <date>2024-04-23</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/6VHDJMYtn3Q?si=ooHFiR003rHA60CU" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>LearnYard Problem:Good Question</remarks>
 * <companies>Google:PhonePE</companies>
 * </metadata>
 * */
public class MinimumSpeedToArrive {

    public static int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        long start = 1;
        //long end = (long) 10e9;
        long end = Math.max(Arrays.stream(dist).max().getAsInt(), (int)Math.ceil(dist[n - 1] / (hour - n + 1)));;
        long ans = -1;
        while(start <= end) {
            long mid = start + (end - start)/2;
            double computeHours = getHours(dist, mid);
            if(computeHours <= hour) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int)ans;
    }

    public static double getHours(int[] dist, long speed) {
        double ans = 0;
        for (int i = 0; i < dist.length; i++) {
            double d = dist[i] * 1.0 / speed;
            if (i != dist.length - 1)
                ans = ans + Math.ceil(d);
            else {
                ans += d;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(minSpeedOnTime(new int[]{1,3,2}, 1.9));
    }
}
