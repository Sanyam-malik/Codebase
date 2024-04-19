package Arrays;


/*
 * <metadata>
 * <name>Maximum Difference Between Increasing Elements</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Max_Diff_Increasing_Elem.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/</url>
 * <date>2024-03-12</date>
 * <level>Easy</level>
 * <companies>Cisco:Apple:Expedia:Incedo Inc:DE Shaw India</companies>
 * <remarks>Needs Revision of Concept:LearnYard Problem</remarks>
 * <notes>Use Prefix min Array</notes>
 * </metadata>
 * */
public class MaxDifference {

    public int maximumDifference(int[] nums) {
        int ans = -1, min_till_now = Integer.MAX_VALUE;

        for(int num : nums) {
            if(min_till_now < num)
                ans = Math.max(ans, num - min_till_now);

            min_till_now = Math.min(min_till_now, num);
        }

        return ans;
    }

}
