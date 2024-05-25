package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LFUCache {

    HashMap<Integer, Integer> map = new HashMap<>();
    LinkedHashMap<Integer, Integer> freqMap = new LinkedHashMap<>();
    int capacity = 0;

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            addFreq(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(!map.containsKey(key) && map.size() == capacity) {
            removeLessUsed();
        }
        map.put(key, value);
        addFreq(key);
    }

    public void addFreq(int key) {
        int val = freqMap.getOrDefault(key, 0)+1;
        freqMap.remove(key);
        freqMap.put(key, val);
    }

    public void removeLessUsed() {
        Integer minUsedKey = null;
        for(Integer key: freqMap.keySet()) {
            if(minUsedKey == null) minUsedKey = key;
            if(minUsedKey != null && freqMap.get(minUsedKey) > freqMap.get(key)) {
                minUsedKey = key;
            }
        }
        map.remove(minUsedKey);
        freqMap.remove(minUsedKey);
    }

    public static void main(String args[]) {
        LFUCache lfu = new LFUCache(2);
        lfu.put(2, 1);
        lfu.put(3, 2);
        lfu.get(3);
        lfu.get(2);
        lfu.put(4, 3);
        System.out.println(lfu.get(2));
        System.out.println(lfu.get(3));
        System.out.println(lfu.get(4));
    }
}
