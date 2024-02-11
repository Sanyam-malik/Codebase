package Basics;

public interface CustomList<T>{

    public void add(T object);

    public void set(int index, T object);

    public T remove(int index);

    public T remove(T object);

    public boolean isEmpty();

    public int size();

    public String toString();

}
