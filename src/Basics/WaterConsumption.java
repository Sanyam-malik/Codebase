package Basics;

/*
 * <metadata>
 *   Name:- Water Consumption,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF80NS5wbmc=&version_id=null">,
 *   URL:- https://www.codechef.com/problems/WATERCONS,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Remarks:- Revised Once,
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
