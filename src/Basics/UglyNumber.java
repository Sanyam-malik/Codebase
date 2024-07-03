package Basics;

/*
 * <metadata>
 * <name>Ugly Number</name>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/ugly-number/description/</url>
 * <date>2024-07-02</date>
 * <level>Easy</level>
 * </metadata>
 * */
public class UglyNumber {

    public boolean isUgly(int n) {
        if(n < 1) return false;
        while(n > 1) {
            if(n % 2 == 0) n = n/2;
            else if(n % 3 == 0) n = n/3;
            else if(n % 5 == 0) n = n/5;
            else {
                return false;
            }
        }
        return true;
    }
}
