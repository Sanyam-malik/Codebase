package KunalHomework.Arrays;

import java.util.List;
import java.util.stream.Collectors;

/*
 * <metadata>
 *   Name:- Count Items Matching a Rule,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/count-items-matching-a-rule,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class CountItemsMatch {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        items = items.stream().filter(x-> x.get(index).equals(ruleValue)).collect(Collectors.toList());
        return items.size();
    }

}
