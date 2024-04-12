package Extra_Problems.Searching;

import java.util.Random;
import java.util.Arrays;


/*
 * <metadata>
 *   Name:- First Bad Version,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/BadVersion.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/first-bad-version/description/,
 *   Date:- 2024-04-12,
 *   Level:- Easy,
 *   Notes:- Use Binary Search,
 *   Remarks:- Kunal Kushwaha,
 *   Companies:- Apple:Adobe:Cisco:Google:Amazon:Facebook:Microsoft,
 * </metadata>
 * */
public class FirstBadVersion {

    static boolean[] array = new boolean[100];

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) /2;
            boolean isBad = isBadVersion(mid);
            if(isBad) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static boolean isBadVersion(int version) {
        return array[version];
    }

    public static void main(String args[]) {
        Arrays.fill(array, false);
        int no = new Random().nextInt(100);
        for(int i = no; i< 100; i++) {
            array[i] = true;
        }
        System.out.println(firstBadVersion(100));
    }
}
