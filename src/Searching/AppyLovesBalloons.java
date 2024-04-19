package Searching;



/*
 * <metadata>
 * <name>Appy and Balloons</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/AppyBalloons.png"></description>
 * <status>Completed</status>
 * <url>https://www.codechef.com/problems/HMAPPY</url>
 * <date>2024-04-10</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/UzwNDRjCEE4?si=9vzF_AGRBdhe9uda" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>LearnYard Problem:Good Question</remarks>
 * </metadata>
 * */
public class AppyLovesBalloons {

    public long minBalloonsReq(int a[], int b[], long maxCandies) {
        long ans = 0;
        for(int i = 0; i < a.length; ++i) {
            if(b[i] == 0)
                continue;
            ans += Math.max(0, a[i] - maxCandies/b[i]);
        }
        return ans;
    }

    public int max(int a[], int b[]) {
        int n = a.length;
        int max_thershold = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int temp = a[i] * b[i];
            max_thershold = Math.max(max_thershold, temp);
        }
        return max_thershold;
    }

    public long getMinCandies(int[] a, int[] b, long balloonLimit) {
        long beg = 0, end = max(a, b), ans = -1;
        while(beg <= end) {
            long mid = (beg + end)/2;
            if(minBalloonsReq(a, b, mid) <= balloonLimit) {
                ans = mid;
                end = mid - 1;
            }
            else {
                beg = mid + 1;
            }
        }
        return ans;
    }
}
