package Arrays;


/*
 * <metadata>
 *   Name:- Maximum Difference Between Increasing Elements,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF83OC5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/,
 *   Date:- 2024-03-12,
 *   Level:- Easy,
 *   Companies:- Cisco:Apple:Expedia:Incedo Inc:DE Shaw India,
 *   Remarks:- Needs Revision of Concept:LearnYard Problem,
 *   Notes:- Use Prefix min Array,
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
