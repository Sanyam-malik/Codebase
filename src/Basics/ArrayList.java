package Basics;

import java.util.Arrays;

public class ArrayList<T> implements ListOperations<T> {

    private T[] array;
    int size = 0;

    int currentIndex = -1;

    @Override
    public boolean hasNext() {
        return currentIndex+1 < array.length;
    }

    @Override
    public T next() {
        return array[currentIndex+1];
    }

    @SuppressWarnings("unchecked")
    public ArrayList() {
        array = (T[]) new Object[10];
    }


    @SuppressWarnings("unchecked")
    private void createNewArray(){
        int newLength = array.length + (array.length/2);
        T[] newArray = (T[]) new Object[newLength];
        for(int index  = 0; index < array.length; index++) {
            newArray[index] = array[index];
        }
        array = newArray;
    }

    @Override
    public void add(T data) {
        if(size == array.length) {
            createNewArray();
        }
        array[size] = data;
        size++;
    }

    @Override
    public void addAll(ListOperations<T> data) {
        for (ListOperations<T> it = data; it.hasNext(); ) {
            T elem = it.next();
            this.add(elem);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T data) {
        T[] backup = array;
        Arrays.sort(backup);

        int left = 0;
        int right = array.length;

        if(data instanceof Integer) {
            while(left < right) {
                int mid = (right - left)/2;

                if(data == backup[mid]) {
                    return true;
                }
                else if(((Integer) data).intValue() < ((Integer) backup[mid]).intValue()) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
        } else {
            for(T elem: backup) {
                if(elem == data) {
                    return true;
                }
            }
        }
        return false;
    }

    public int containsValue(T data) {
        T[] backup = array;
        Arrays.sort(backup);

        int left = 0;
        int right = array.length;

        if(data instanceof Integer) {
            while(left < right) {
                int mid = (right - left)/2;

                if(data == backup[mid]) {
                    return mid;
                }
                else if(((Integer) data).intValue() < ((Integer) backup[mid]).intValue()) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
        } else {
            for(int index = 0; index< array.length; index++) {
                if(array[index] == data) {
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        return index < size ? array[index] : null;
    }

    @Override
    public void set(int index, T data) {
        if(index < size){
            array[index] = data;
        }
    }

    @Override
    public void remove(int index) {
        if(index < size) {
            shiftElements(index);
            size--;
        }
    }

    private void shiftElements(int index) {
        while(index < array.length - 1) {
            array[index] = array[index+1];
            index++;
        }
    }

    @Override
    public void remove(T data) {
        int index = this.containsValue(data);
        if(index > -1) {
            this.remove(index);
        }
    }

}
