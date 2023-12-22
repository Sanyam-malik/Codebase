package Basics;

import java.util.Iterator;

/*
* Default List Operations
* */
public interface ListOperations<T> extends Iterator<T> {

    public void add(T data);

    public void addAll(ListOperations<T> data);

    public int size();
    public boolean isEmpty();

    public boolean contains(T data);

    public T get(int index);

    public void set(int index, T data);

    public void remove(int index);

    public void remove(T data);

}
