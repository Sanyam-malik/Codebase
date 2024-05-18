package Basics;

/*
 * <metadata>
 * <name>Add Digits</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Add_Digits.png"></description>
 * <url>https://leetcode.com/problems/add-digits</url>
 * <date>2024-02-14</date>
 * <level>Easy</level>
 * <notes>Modulus and Divide Technique to Sum the Digits</notes>
 * <companies>Bloomberg</companies>
 * <remarks></remarks>
 * </metadata>
 * */
public class AddDigits {
    public static int addDigits(int num) {
        int sum = num;
        while(sum >= 10) {
            sum = addDigitsHelper(sum);
        }
        return sum;

    }

    public static int addDigitsHelper(int num) {
        int sum = 0;
        while(num > 0) {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(addDigits(38));
    }
}
