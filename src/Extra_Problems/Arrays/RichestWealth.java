package Extra_Problems.Arrays;


/*
 * <metadata>
 * <name>Richest Customer Wealth - Revision</name>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/richest-customer-wealth</url>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Richest_Customer_Wealth.png"></description>
 * <date>2024-02-18</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Adobe</companies>
 * <countinclusion>no<countinclusion>
 * </metadata>
 * */
public class RichestWealth {

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i< accounts.length; i++) {
            int sum = 0;
            for(int j=0; j< accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
