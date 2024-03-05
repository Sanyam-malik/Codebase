package Arrays;




/*
 * <metadata>
 *   Name:- Richest Customer Wealth,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMjItNDctNDMucG5n&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/richest-customer-wealth,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Companies:- Adobe,
 *   Notes:- Normal Approach,
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
