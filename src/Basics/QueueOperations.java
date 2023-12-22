package Basics;

/*
* Default Operations for Queue
* */
public interface QueueOperations<T> {

    public boolean isEmpty();

    public int size();

    public void add(T data);

    public T remove();

    public T get();
}
