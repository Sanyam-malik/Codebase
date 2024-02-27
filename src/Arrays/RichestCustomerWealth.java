package Arrays;




/*
 * <metadata>
 *   Name:- Richest Customer Wealth,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/richest-customer-wealth,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Notes:- No Notes,
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
