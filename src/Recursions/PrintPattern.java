package Recursions;
import java.util.ArrayList;
import java.util.List;



/*
 * <metadata>
 * <name>Print Pattern</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/PrintPattern.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/print-pattern3549/1</url>
 * <date>2024-03-30</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Microsoft</companies>
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
