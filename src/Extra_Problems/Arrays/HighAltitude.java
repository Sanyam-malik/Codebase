package Extra_Problems.Arrays;



/*
 * <metadata>
 * <name>Find the Highest Altitude</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Find_Highest_Altitude.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-the-highest-altitude</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <companies>Apple:Cisco:Expedia:Incedo Inc:DE Shaw India</companies>
 * <notes>No Notes Needed</notes>
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
