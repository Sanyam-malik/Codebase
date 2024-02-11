package Arrays;

import Basics.CustomIterator;

public class ArrayListInterator<T> implements CustomIterator<T> {

    private T[] dynamicArray;
    int index = -1;
    int size = 0;
    public ArrayListInterator(T[] dynamicArray, int size) {
        this.dynamicArray = dynamicArray;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return index+1 < size;
    }

    @Override
    public T next() {
        return dynamicArray[++index];
    }
}
