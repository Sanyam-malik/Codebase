package Contest;


import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/*
 * <metadata>
 * <name>Optimizing Competition</name>
 * <status>To Do</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/OptimizingCompetition.png"></description>
 * <url>https://www.techgig.com/codegladiators</url>
 * <date>2024-05-08</date>
 * <level>Easy</level>
 * <notes>Self Explainary</notes>
 * </metadata>
 * */
public class OptimizingCompetition {

    public static int maximumTeams(int[] w) {
        int maxTeams = 0;
        for(int i=1; i<findMax(w); i++) {
            maxTeams = Math.max(maxTeams, noOfTeams(w, i));
        }
        return maxTeams;
    }

    public static int maximumTeamsOptimized(int[] w) {
        Arrays.sort(w); // Sort the weights in ascending order
        int maxTeams = 0;
        for (int i = 1; i < w.length; i++) {
            int teams = countTeams(w, w[i]);
            maxTeams = Math.max(maxTeams, teams);
        }
        return maxTeams;
    }

    public static int countTeams(int[] weights, int commonWt) {
        int teams = 0;
        int left = 0;
        int right = weights.length - 1;

        while (left < right) {
            if (weights[left] + weights[right] <= commonWt) {
                left++;
                right--;
                teams++;
            } else {
                right--;
            }
        }
        return teams;
    }

    public static int findTotal(int[] arr) {
        int sum = 0;
        for(int i: arr) {
            sum+=i;
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for(int i: arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static int noOfTeams(int[] arr, int commonWt) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int teams = 0;
        for(int i=0; i< arr.length; i++) {
            int diff = Math.max(commonWt, i) - Math.min(commonWt, i);
            if(countMap.containsKey(diff)) {
                countMap.put(diff, countMap.get(diff)-1);
                teams++;
            } else {
                countMap.put(diff, countMap.getOrDefault(diff, 0)+1);
            }
        }
        return teams;
    }

    public static void main(String args[]) {
        System.out.println(maximumTeamsOptimized(new int[]{1,1,3,4,2,2}));
    }
}
