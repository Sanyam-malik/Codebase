package Arrays;

import Basics.CustomIteratable;
import Basics.CustomIterator;
import Basics.CustomList;

@SuppressWarnings("unchecked")
public class ArrayList<T> implements CustomList<T>, CustomIteratable<T> {
    private int size = 0;
    private int capacity = 10;

    // Generic Array
    private T[] dynamicArray;
    public ArrayList() {
        // Initiated The Generic Array To The Capacity
        dynamicArray = (T[]) new Object[capacity];
    }

    public ArrayList(int capacity) {
        // Initiated The Generic Array To The Capacity
        this.capacity = capacity;
        dynamicArray = (T[]) new Object[capacity];
    }

    // Adding elem to List
    public void add(T object) {
        // Check if the array will exceed the capacity by adding other elem
        if(size+1 >= capacity) {
            // Create a new array with size 2*capacity
            this.copyArray();
            dynamicArray[size++] = object;
        } else {
            // Add Elem to Array
            dynamicArray[size++] = object;
        }
    }

    // Replacing new elem to list
    public void set(int index, T object) {
        // Edge Case: if index is lesser than 0 or greater than size add the elem to last
        if(index < 0 || index > size) {
            this.add(object);
        } else {
            // Change elem for a particular index
            dynamicArray[index] = object;
        }
    }

    // Remove elem by index
    public T remove(int index) {
        T elemRemoved = null;
        // Edge Case: If index is lesser than 0 or greater than size remove the last value;
        if(index < 0 || index > size) {
            elemRemoved = dynamicArray[size];
            dynamicArray[size--] = null;
        } else {
            elemRemoved = dynamicArray[index];
            for(int i=index; i< size; i++) {
                dynamicArray[i] = dynamicArray[i+1];
            }
            dynamicArray[size--] = null;
        }
        return elemRemoved;
    }


    // Remove elem by value
    public T remove(T object) {
        T elemRemoved = null;
        for(int i=0; i< size; i++) {
            if(dynamicArray[i].hashCode() == object.hashCode()) {
                elemRemoved = this.remove(i);
                break;
            }
        }
        return elemRemoved;
    }

    // Checking of List is empty
    public boolean isEmpty() {
        return size == 0;
    }


    // Getting the size of the list
    public int size() {
        return size;
    }

    private void copyArray() {
        T[] newArray = (T[]) new Object[2*capacity];
        for(int i=0; i< size; i++) {
            newArray[i] = this.dynamicArray[i];
        }
        this.dynamicArray = newArray;
        this.capacity = 2*capacity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i< size; i++) {
            sb.append(dynamicArray[i].toString());
            if(i != size -1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public CustomIterator<T> iterator() {
        return new ArrayListInterator<T>(dynamicArray, size);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(45);
        list.add(13);
        list.add(46);
        list.add(89);
        list.add(3);
        list.add(46);
        CustomIterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

