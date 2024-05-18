package Basics;

/*
 * <metadata>
 * <name>Water Consumption</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Water_Consumption.png"></description>
 * <url>https://www.codechef.com/problems/WATERCONS</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks></remarks>
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
