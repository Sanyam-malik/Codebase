package Basics;

public interface MapOperations<K, V> {

    public boolean isEmpty();

    public int size();
    public void put(K key, V value);

    public void get(K key);

    public void containsValue(V value);

    public void set(K key, V value);

    public ListOperations<K> keySet();

    public ListOperations<V> valuesSet();

    public ListOperations<MapOperations<K, V>> entrySet();
}
