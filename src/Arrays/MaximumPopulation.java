package Arrays;

/*
 * <metadata>
 * <name>Maximum Population Year</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Maximum_Population_Year.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-population-year/description/</url>
 * <date>2024-03-08</date>
 * <level>Easy</level>
 * <remarks>Complex To Understand</remarks>
 * <companies>Cisco:Google:Bloomberg</companies>
 * <notes>Solution 1 Hint - Create a array of 100 length and add the 1 for range and then find the max</notes>
 * </metadata>
 * */
public class MaximumPopulation {

    public int maximumPopulation(int[][] logs) {
        int[] array = new int[101];
        for(int[] log: logs) {
            int end = log[1] - log[0];
            int index = log[0] - 1950;
            for(int start=0; start< end; start++) {
                array[index++] += 1;
            }
        }

        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i< array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return index+1950;
    }

}
