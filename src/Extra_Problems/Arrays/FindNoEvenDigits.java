package Extra_Problems.Arrays;

/*
 * <metadata>
 * <name>Find Numbers with Even Number of Digits</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Find_No_with_Even_Digits.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-numbers-with-even-number-of-digits</url>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <companies>Amazon</companies>
 * <notes>No Notes Needed</notes>
 * </metadata>
 * */
public class FindNoEvenDigits {

    public int findNumbers(int[] nums) {
        int result= 0;
        for(int num: nums) {
            int countNo = (int)Math.log10(num)+1;
            result += (countNo%2 == 0 ? 1 : 0);
        }
        return result;
    }

}
