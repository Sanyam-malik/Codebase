package Kunal_Homework.Arrays;

import java.util.ArrayList;
import java.util.List;


/*
 * <metadata>
 *   Name:- Kids With the Greatest Number of Candies,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/kids-with-the-greatest-number-of-candies,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
