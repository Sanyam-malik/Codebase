package Math;

/*
 * <metadata>
 *   Status: InComplete,
 *   URL: https://www.codingninjas.com/studio/problems/angle-between-hour-hand-and-minute-hand_1062726,
 *   Notes: Test cases failing
 * </metadata>
 * */
public class AngleBetweenClockHands {

    public static int findAngle(int hour, int minute) {
        int angle= (int) Math.abs(30*hour+0.5*minute-6*minute);

        // Ensure the smaller angle is considered
        return Math.min(angle, 360 - angle);
    }

    public static void main(String[] args) {
        System.out.println(findAngle(8, 55));
    }
}
