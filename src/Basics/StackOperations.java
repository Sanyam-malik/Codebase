package Basics;

/*
* Default Operations for Stack
* */
public interface StackOperations<T> {

    public boolean isEmpty();
    public int size();

    public T peek();

    public void push(T data);

    public T pop();

}
