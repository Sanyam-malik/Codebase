package Sorting;
import java.util.*;


/*
 * <metadata>
 *   Name:- Qualifying to Pre-Elimination,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/QUALPREL.png">,
 *   URL:- https://www.codechef.com/problems/QUALPREL,
 *   Date:- 2024-04-04,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Remarks:- LearnYard Problem,
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
