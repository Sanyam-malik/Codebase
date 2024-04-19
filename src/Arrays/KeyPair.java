package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/*
 * <metadata>
 * <name>Key Pair</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/KeyPair.png"></description>
 * <url>https://www.geeksforgeeks.org/problems/key-pair5616/1</url>
 * <date>2024-02-26</date>
 * <level>Easy</level>
 * <remarks>LearnYard Problem</remarks>
 * <companies>Zoho:Flipkart:Morgan Stanley:Accolite:Amazon:Microsoft:FactSet:Hike:Adobe:Google:Wipro:SAP Labs:CarWale</companies>
 * <notes>Solution 1 - Two Four Loops? </br></br>Solution 2 - Iterate and save elements and check if the diff matches?</notes>
 * </metadata>
 * */
public class KeyPair {

    // Time-Complexity: O(n log n), Space-Complexity: O(1)
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        int i = 0;
        int j = n - 1;
        Arrays.sort(arr);
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum == x) {
                return true;
            } else if(sum > x) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    // Time-Complexity: O(N), Space-Complexity: O(N)
    boolean hasArrayTwoCandidatesMoreOptimized(int arr[], int n, int x) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i< n; i++) {
            int diff = x - arr[i];
            if(set.contains(diff)) return true;
            set.add(arr[i]);
        }
        return false;
    }
}
