package KunalHomework.Arrays;



/*
 * <metadata>
 *   Name:- Find the Highest Altitude,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-the-highest-altitude,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
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
