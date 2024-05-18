package Searching;



/*
 * <metadata>
 * <name>Minimum Time to Complete Trips</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumTimeTrips.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>Minimum Time to Complete Trips</url>
 * <date>2024-04-19</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/tUCVupA0lAc?si=8Icm_uzTuaM3vgiq" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>Good Question</remarks>
 * <companies>Uber:Apple:Google:Amazon:Amadeus</companies>
 * </metadata>
 * */
public class MinimumTimeForTrips {

    /*
    Brute Force Solution

    public static long minimumTime(int[] time, int totalTrips) {
        if(time.length == 1) {
            return (long) totalTrips * time[0];
        }

        int ans = -1;
        for(int i=0; i<time.length; i++) {
            int[] temp = new int[time.length];
            for(int j=0; j<=i;j++) {
                temp[j] = time[i] / time[j];
            }

            if(findSum(temp) == totalTrips) {
                ans = time[i];
                break;
            }
        }
        return ans;
    }

    public static int findSum(int[] nums) {
        int ans = 0;
        for(int i: nums) {
            ans+=i;
        }
        return ans;
    }
    */

    public static long minimumTime(int[] time, int totalTrips) {
        if (time.length == 1) {
            return (long) totalTrips * time[0];
        }

        long start = 0;
        long end = (int) 10e7 * (int) 10e7;
        while(start < end) {
            long mid = start + (end - start)/2;
            long compute = timeTaken(time, mid);

            if(compute >= totalTrips) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static long timeTaken(int[] time, long num) {
        long sum = 0;
        for(int j=0; j<time.length;j++) {
            if(j <= num) {
                sum += num / time[j];
            } else {
                break;
            }
        }
        return sum;
    }


    public static void main(String args[]) {
        System.out.println(minimumTime(new int[]{1,1,1,1,1}, 5));
    }
}
