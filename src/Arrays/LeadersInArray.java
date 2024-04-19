package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


/*
 * <metadata>
 * <name>Leaders in an array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Leaders_Array.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1</url>
 * <date>2024-02-23</date>
 * <level>Easy</level>
 * <companies>Payu:Adobe</companies>
 * <notes>Solution - Start from last index upto first index why last index because last one is always the leader if you start from the first there is possibility of saving the same element.</notes>
 * </metadata>
 * */
public class LeadersInArray {

    static ArrayList<Integer> leaders(int arr[], int n){

        // start traversing the loop from end and
        // maintain max element while traversing from end
        // if arr[i] > max then it is a leader otherwise not

        ArrayList<Integer> result= new ArrayList<Integer>();
        result.add(arr[n-1]);
        long max = arr[n-1];
        for (int i=n-2;i>=0;i--) {
            if (arr[i]>=max){
                result.add(arr[i]);
            }
            max= Math.max(max,arr[i]);
        }
        result.sort(Collections.reverseOrder());
        return result;
    }

    public static void main(String args[]) {
        System.out.println(leaders(new int[]{31, 40, 93, 40, 98}, 5));
    }
}
