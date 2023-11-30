package Problem_Of_The_Day;

import java.util.Arrays;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/problem-selection_2824965
 * </metadata>
 * */
public class ProblemSelection {

    public static long maxValue(int[] A, int k){
        // questions are blocked till index (i)
        // you start answering questions from index (j)
        int i = -1; int j = A.length-1;
        long max = 0;
        while (i < j){
            max += A[j];
            i+=k; // block next k questions
            --j; // move to next question
        }
        return max;
    }
    public static long minValue(int[] A, int k){
        // questions are blocked till index j
        // you start answering from index i
        int i = 0; int j = A.length;
        long min = 0;
        while (i < j){
            min += A[i];
            ++i; // move to next question
            j-=k; // block next k questions
        }
        return min;
    }
    public static long[] problemSelection(int[] A, int k) {
        Arrays.sort(A);
        long max = maxValue(A, k);
        long min = minValue(A, k);
        return new long[]{min,max};
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(problemSelection(new int[]{3, 14, 15, 10, 2, 20, 12, 4, 4, 17, 14, 8, 1, 4, 9, 5, 16, 4, 3, 20}, 7)));
    }
}
