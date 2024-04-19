package Arrays;

/*
 * <metadata>
 * <name>Sum of Array</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Sum_of_Array.png"></description>
 * <url>https://www.geeksforgeeks.org/problems/sum-of-array2326/1</url>
 * <date>2024-02-23</date>
 * <level>Easy</level>
 * <notes>Regular Loop</notes>
 * </metadata>
 * */
public class SumOfArray {

    int sum(int arr[], int n) {
        int sum = 0;
        for(int i: arr) {
            sum+=i;
        }

        return sum;
    }

}
