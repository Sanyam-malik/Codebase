package Recursions;
import java.util.ArrayList;
import java.util.List;



/*
 * <metadata>
 *   Name:- Print Pattern,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/PrintPattern.png">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/print-pattern3549/1,
 *   Date:- 2024-03-30,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Microsoft,
 * </metadata>
 * */
public class PrintPattern {

    public static List<Integer> pattern(int N){
        List<Integer> list = new ArrayList<>();
        helper(list, N);
        return list;
    }

    public static void helper(List<Integer> list, int N) {
        list.add(N);
        if(N <= 0) {
            return;
        }
        helper(list, N-5);
        list.add(N);
    }

    public static void main(String args[]) {
        System.out.println(pattern(16));
    }
}
