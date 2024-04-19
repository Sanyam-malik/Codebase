package Sorting;
import java.util.*;

/*
 * <metadata>
 * <name>Nuts Bolts</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Nuts_bolts.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article</url>
 * <date>2024-04-05</date>
 * <level>Medium</level>
 * <notes>Just Sort</notes>
 * <companies>Amazon:Hike:Make:MyTrip:MAQ Software:Adobe</companies>
 * <remarks>LearnYard Problem</remarks>
 * </metadata>
 * */
public class NutsBolts {
    void matchPairs(char nuts[], char bolts[], int n) {
        Arrays.sort(nuts);
        Arrays.sort(bolts);
    }
}
