package Sorting;
import java.util.*;


/*
 * <metadata>
 * <name>Qualifying to Pre-Elimination</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/QUALPREL.png"></description>
 * <url>https://www.codechef.com/problems/QUALPREL</url>
 * <date>2024-04-05</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks></remarks>
 * </metadata>
 * */
public class QualifyingPreelimination {

    public static int teamsQualified(int[] arr, int k) {
        arr = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        int score = arr[k-1];
        int count = 0;
        for(int i: arr) {
            if(i >= score) count++;
        }
        return count;
    }

    public static void main (String[] args){
        System.out.println(teamsQualified(new int[]{3, 5, 2, 4, 5}, 1));
    }
}
