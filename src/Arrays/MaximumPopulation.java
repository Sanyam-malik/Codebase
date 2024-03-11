package Arrays;

/*
 * <metadata>
 *   Name:- Maximum Population Year,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8yMC5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/maximum-population-year/description/,
 *   Date:- 2024-03-08,
 *   Level:- Easy,
 *   Remarks:- Complex To Understand,
 *   Companies:- Cisco:Google:Bloomberg,
 *   Notes:-
 *           Solution 1 Hint - Create a array of 100 length and add the 1 for range and then find the max,
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
