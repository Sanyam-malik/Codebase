package Arrays;

import java.util.*;


/*
 * <metadata>
 * <name>Common elements</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Common_elements.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/common-elements1132/1</url>
 * <date>2024-03-07</date>
 * <level>Easy</level>
 * <companies>VMWare:Microsoft:MAQ Software</companies>
 * <notes>Solution Hint - Great Intersection Technique of All Time</notes>
 * </metadata>
 * */
public class Intersection {

    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3){
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int v: A) {
            map.put(v, 1);
        }
        for(int v: B) {
            if (map.containsKey(v)) map.put(v, 2);
        }
        for(int v: C) {
            if (map.containsKey(v)) map.put(v, 3);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 3) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static void main(String args[]) {

        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(commonElements(a, b, c, a.length, b.length, c.length));
    }

}
