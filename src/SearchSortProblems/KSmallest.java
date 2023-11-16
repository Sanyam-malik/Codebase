package SearchSortProblems;
import java.util.*;
public class KSmallest {

    public static ArrayList<Integer> kthSmallest(ArrayList<ArrayList<Integer>> ranges, ArrayList<Integer> queries) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(ArrayList<Integer> range: ranges) {
            int min = range.get(0);
            int max = range.get(1);
            if(min > max) {
                min = range.get(1);
                max = range.get(0);
            }
            for(int i=min;i<=max;i++) {
                set.add(i);
            }
        }

        ArrayList<Integer> mainlist = new ArrayList<>(set);
        Collections.sort(mainlist);

        for(Integer query: queries) {
            if(query-1 > mainlist.size()-1) {
                result.add(-1);
            } else {
                result.add(mainlist.get(query - 1));
            }
        }

        return  result;
    }

    public static void main(String[] a) {
        ArrayList<ArrayList<Integer>> ranges = new ArrayList<>();
        ranges.add(new ArrayList<>(List.of(5, 6)));
        ranges.add(new ArrayList<>(List.of(1, 2)));
        ranges.add(new ArrayList<>(List.of(1, 1)));
        ranges.add(new ArrayList<>(List.of(1, 2)));

        ArrayList<Integer> queries = new ArrayList<>(List.of(1, 2, 3, 5));

        System.out.println(kthSmallest(ranges, queries));
    }
}
