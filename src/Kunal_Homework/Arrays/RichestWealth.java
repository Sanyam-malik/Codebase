package Kunal_Homework.Arrays;


/*
 * <metadata>
 *   Name:- Richest Customer Wealth,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/richest-customer-wealth,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF82NS5wbmc=&version_id=null">,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Adobe,
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
