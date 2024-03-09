package Basics;

/*
 * <metadata>
 *   Name:- Power of Two,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8zOC5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/power-of-two,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- Use log or BitWise Manipulation,
 * </metadata>
 * */
public class PowerOfTwo {

    /*
    * Althrough It works in real mathematics it will not work in java due to inaccuracy of precision
    * */
    public static boolean isPowerOfTwo(int n) {
        double temp = (Math.log(n)/Math.log(2));
        return temp % 1 == 0;
    }

    public static boolean isPowerOfTwoBit(int n) {
        return (n & (n-1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwoBit(536870912));
    }
}
