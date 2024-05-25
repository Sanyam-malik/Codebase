package HashMap;

import java.util.LinkedHashMap;


/*
 * <metadata>
 * <name>LRU Cache</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/LRUCache.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/lru-cache/description/</url>
 * <date>2024-05-25</date>
 * <level>Medium</level>
 * <remarks>Good Question</remarks>
 * <companies>TCS:OYO:OLA:RBS:Hike:Visa:Zoho:Zeta:Uber:Dunzo:Optum:PayTM:Apple:Adobe:Yahoo:Amazon:Swiggy:Zomato:Amdocs:Oracle:Google:Intuit:Twilio:tiktok:Nvidia:VMware:Paypal:Shopee:Siemens:GoDaddy:Lenskart:JPMorgan:Sprinklr:Qualcomm:Facebook:Arcesium:Flipkart:Aliibaba:Palantir:Accolite:LinkedIn:Snapchat:Docusign:Cognizant:Microsoft:Bloomberg:ByteDance:Policbazar:Salesforce:Wells Fargo:Expedia Group:De Shaw India:Goldman Sachs:Morgan Stanley:Disney+ Hotstar:Publicis Sapient:Walmart Global Tech</companies>
 * <notes>See The Code</notes>
 * </metadata>
 * */
public class LRUCache {

    /* Define LinkedHashMap to maintain access order */
    public LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    public int capacity = 0;

    /* Constructor to initialize the LRUCache with a given capacity */
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    /* Get method to retrieve the value corresponding to the given key */
    public int get(int key) {
        /* If key is present, update its access order */
        if(map.containsKey(key)) {
            int val = map.get(key); /* Retrieve value */
            map.remove(key); /* Remove and re-insert to update access order */
            map.put(key, val);
        }
        /* Return value, or -1 if key is not found */
        return map.getOrDefault(key, -1);
    }

    /* Put method to insert or update a key-value pair */
    public void put(int key, int value) {
        /* If the cache is full and the key is not present */
        if (map.size() == capacity && !map.containsKey(key)) {
            map.pollFirstEntry(); /* Remove the least recently used entry */
        }
        map.remove(key); /* Remove if key exists */
        map.put(key, value); /* Insert or update key-value pair */
    }

    public static void main(String args[]) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(2, 1);
        lRUCache.put(1, 1);
        lRUCache.put(2, 3);
        lRUCache.put(4, 1);
        lRUCache.get(1);
        lRUCache.get(2);
    }
}
