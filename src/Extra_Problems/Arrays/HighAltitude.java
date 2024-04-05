package Extra_Problems.Arrays;



/*
 * <metadata>
 *   Name:- Find the Highest Altitude,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Find_Highest_Altitude.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-the-highest-altitude,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Companies:- Apple:Cisco:Expedia:Incedo Inc:DE Shaw India,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class HighAltitude {

    public static int largestAltitude(int[] gain) {
        int runnningAltitude = 0;
        int maxGain = 0;

        for(int i=0; i< gain.length; i++) {
            runnningAltitude+=gain[i];
            maxGain = Math.max(maxGain, runnningAltitude);
        }
        return maxGain;
    }
}
