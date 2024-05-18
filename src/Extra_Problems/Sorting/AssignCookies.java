package Extra_Problems.Sorting;
import java.util.*;

/*
 * <metadata>
 * <name>Assign Cookies</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/AssignCookies.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/assign-cookies/description/</url>
 * <date>2024-04-17</date>
 * <level>Easy</level>
 * <companies>Apple</companies>
 * <notes>Sort and use two pointers approach</notes>
 * <remarks></remarks>
 * </metadata>
 * */
public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int i = 0;
        int j = 0;
        while(j < g.length &&  i < s.length) {
            if(s[i] >= g[j]) {
                i++;j++;ans++;
            }
            else if(s[i] < g[j]) {
                i++;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(findContentChildren(new int[]{10,9,8,7}, new int[]{5,6,7,8}));
    }
}
