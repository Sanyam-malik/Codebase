package Math;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/angle-between-hour-hand-and-minute-hand_1062726
 * </metadata>
 * */
public class AngleBetweenClockHands {

    public static double absoluteDiff(double a, double b) {
        if(a > b) {
            return a - b;
        }
        else{
            return b - a;
        }
    }
    public static int findAngle(int hour, int minute) {
        if (hour == 12) {
            hour = 0;
        }

        double hourAngle = 0.5 * (hour * 60 + minute);
        double minuteAngle = 6 * (minute);

        //Finding the angle with respect to the absolute difference.
        double angle = absoluteDiff(hourAngle, minuteAngle);

        //If the angle is more than 180 degrees we take the angle other way around.
        angle = Math.min(angle, 360 - angle);

        return (int)angle;
    }

    public static void main(String[] args) {
        System.out.println(findAngle(8, 55));
    }
}
