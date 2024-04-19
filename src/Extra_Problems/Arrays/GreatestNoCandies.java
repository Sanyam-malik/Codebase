package Extra_Problems.Arrays;

import java.util.ArrayList;
import java.util.List;


/*
 * <metadata>
 * <name>Kids With the Greatest Number of Candies</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Kids_With_Candies.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/kids-with-the-greatest-number-of-candies</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <companies>Amazon</companies>
 * <notes>No Notes Needed</notes>
 * </metadata>
 * */
public class GreatestNoCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i< candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        for(Integer candy: candies) {
            if(candy+extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

}
