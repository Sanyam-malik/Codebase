package Searching;


/*
 * <metadata>
 * <name>Capacity To Ship Packages Within D Days</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ShipWithinDays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/</url>
 * <date>2024-04-10</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/MG-Ac4TAvTY?si=AmOuYv_5QygMmyR_" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <companies>Uber:Agoda:Apple:Adobe:TikTok:Amazon:Oracle:Google:Expedia:CureFit:Facebook:Flipkart:DoorDash:Bloomberg:Microsoft:Salesforce:Goldman Sachs</companies>
 * <remarks>Good Question</remarks>
 * </metadata>
 * */
public class ShipWithinDays {
    static int maxValue(int w[]) {
        int ans = 0;
        for(int num : w)
            ans = Math.max(ans, num);
        return ans;
    }
    static int sumOfValues(int w[]) {
        int sum = 0;
        for(int num : w)
            sum += num;
        return sum;
    }

    static int minDaysReq(int[] w, int cap) {
        int curDay = 1, curLoad = 0;

        for(int item : w) {
            if(curLoad + item <= cap)
                curLoad += item;
            else {
                curDay += 1;
                curLoad = item;
            }
        }

        return curDay;
    }

    public static int shipWithinDays(int[] w, int days) {
        int beg = maxValue(w), end = sumOfValues(w), minCap = -1;
        while(beg <= end) {
            int midCap = (beg + end)/2;
            if(minDaysReq(w, midCap) <= days) {
                minCap = midCap;
                end = midCap - 1;
            }
            else {
                beg = midCap + 1;
            }
        }
        return minCap;
    }

    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 15));
    }
}
