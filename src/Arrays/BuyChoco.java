package Arrays;

import java.util.Arrays;



/*
 * <metadata>
 * <name>Buy Two Chocolates</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Buy_Two_Chocolates.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/buy-two-chocolates/description</url>
 * <date>2024-03-28</date>
 * <level>Easy</level>
 * <notes>Simple find smallest and second smallest</notes>
 * </metadata>
 * */
public class BuyChoco {

    public static int buyChoco(int[] prices, int money) {
        int count = 0;
        int remainingMoney = money;
        Arrays.sort(prices);
        for(int price: prices) {
            if(price <= remainingMoney && count < 2){
                remainingMoney -= price;
                count++;
            }
        }

        return count == 2 ? remainingMoney : money;
    }

    public static void main(String args[]){
        int[] arr = new int[]{69,91,78,19,40,13};
        int money = 94;
        System.out.println(buyChoco(arr, money));
    }
}
