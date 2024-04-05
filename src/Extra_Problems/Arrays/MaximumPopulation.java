package Extra_Problems.Arrays;

/*
 * <metadata>
 *   Name:- Maximum Population Year,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Maximum_Population_Year.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/maximum-population-year,
 *   Date:- 2024-02-20,
 *   Level:- Easy,
 *   Companies:- Cisco:Google:Bloomberg,
 *   Notes:- Wow Great Question!!!,
 * </metadata>
 * */
public class MaximumPopulation {

    public static int maximumPopulation(int[][] logs) {
        int[] array = new int[101];
        for(int[] log: logs) {
            int end = log[1] - log[0];
            int index = log[0] - 1950;
            for(int start=0; start< end; start++) {
                array[index] += 1;
                index += 1;
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

    public static void main(String args[]) {
        System.out.println(maximumPopulation(new int[][]{{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}}));
    }
}
