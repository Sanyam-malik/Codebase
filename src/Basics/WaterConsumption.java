package Basics;

/*
 * <metadata>
 *   Name:- Water Consumption,
 *   Status:- Completed,
 *   URL:- https://www.codechef.com/problems/WATERCONS,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class WaterConsumption {

    public static String waterConsumption(int n) {
        return n >=2000 ? "YES" : "NO";
    }

    public static void main(String args[]) {
        System.out.println(waterConsumption(2000));
    }
}
