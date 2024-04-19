package Extra_Problems.Arrays;

import java.util.List;
import java.util.stream.Collectors;

/*
 * <metadata>
 * <name>Count Items Matching a Rule</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Count_Items_By_Rule.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/count-items-matching-a-rule</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <companies>Adobe:Facebook</companies>
 * <notes>No Notes Needed</notes>
 * </metadata>
 * */
public class CountItemsMatch {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        items = items.stream().filter(x-> x.get(index).equals(ruleValue)).collect(Collectors.toList());
        return items.size();
    }

}
