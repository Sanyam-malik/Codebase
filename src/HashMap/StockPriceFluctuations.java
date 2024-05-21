package HashMap;

import java.util.HashMap;
import java.util.TreeMap;



/*
 * <metadata>
 * <name>Stock Price Fluctuation</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/StockPriceFluctuations.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/stock-price-fluctuation/description/</url>
 * <date>2024-05-21</date>
 * <level>Medium</level>
 * <notes>Use TreeMap and HashMap</notes>
 * <remarks>Good Question</remarks>
 * <companies>Google</companies>
 * </metadata>
 * */
class StockPriceFluctuations {

    HashMap<Integer,Integer> timeToPrice;
    TreeMap<Integer,Integer> priceToFreq;

    int latestTime;
    public StockPriceFluctuations() {
        latestTime = 0;
        timeToPrice = new HashMap<>();
        priceToFreq = new TreeMap<>();
    }

    public void update(int timestamp, int price) {
        latestTime = Math.max(latestTime, timestamp);

        // Decrement the frequency of oldPrice (if exists)
        if(timeToPrice.containsKey(timestamp)) {
            int oldPrice = timeToPrice.get(timestamp);
            int freqOfOldPrice = priceToFreq.get(oldPrice);

            if(freqOfOldPrice == 1)
                priceToFreq.remove(oldPrice);
            else
                priceToFreq.put(oldPrice, freqOfOldPrice - 1);
        }

        // Increment the frequency of the new price
        int curFreqOfNewPrice = priceToFreq.getOrDefault(price, 0);
        priceToFreq.put(price, curFreqOfNewPrice + 1);

        // Update price of timestamp to 'price' in timeToPrice
        timeToPrice.put(timestamp, price);
    }

    public int current() { // O(1)
        return timeToPrice.get(latestTime);
    }

    public int maximum() { // O(logN)
        return priceToFreq.lastKey();
    }

    public int minimum() { // O(logN)
        return priceToFreq.firstKey();
    }

    public static void main(String args[]) {
        StockPriceFluctuations s = new StockPriceFluctuations();
        s.update(1, 10);
        s.update(2, 5);
        System.out.println(s.current());
        System.out.println(s.maximum());
        s.update(1, 3);
        System.out.println(s.maximum());
        s.update(4, 2);
        System.out.println(s.minimum());
    }
}
