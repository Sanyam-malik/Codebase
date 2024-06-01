package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Common elements</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Common_elements.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/common-elements1132/1</url>
 * <date>2024-06-01</date>
 * <level>Easy</level>
 * <companies>VMWare:Microsoft:MAQ Software</companies>
 * <notes>Solution Hint - Great Intersection Technique of All Time</notes>
 * </metadata>
 * */

public class CommonElements {

    static ArrayList<Integer> commonElements(int A[], int B[], int C[]) {
        int i=0, j=0, k = 0;
        Set<Integer> set = new LinkedHashSet<>();
        while(i < A.length && j < B.length && k < C.length) {
            if(A[i] == B[j] && B[j] == C[k]) {
                set.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if(A[i] < B[j]) {
                i++;
            }
            else if(B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        System.out.println(commonElements(new int[]{1, 5, 10, 20, 40, 80}, new int[]{6, 7, 20, 80, 100}, new int[]{3, 4, 15, 20, 30, 70, 80, 120}));
    }
}
