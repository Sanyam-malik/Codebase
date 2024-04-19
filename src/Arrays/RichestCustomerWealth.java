package Arrays;




/*
 * <metadata>
 * <name>Richest Customer Wealth</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Richest_Customer_Wealth.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/richest-customer-wealth</url>
 * <date>2024-02-27</date>
 * <level>Easy</level>
 * <companies>Adobe</companies>
 * <notes>Normal Approach</notes>
 * </metadata>
 * */
public class RichestCustomerWealth {

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
