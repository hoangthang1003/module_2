package ss10_dsa.exercise.MyArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }
    int size() {
        return this.size;
    }
    private void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(Object element) {
        if(elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }
    public  <E> void add(E element, int index) {
        if(index > elements.length){
            throw new IllegalArgumentException("index" + index);
        } else if(elements.length == size) {
            this.ensureCapacity(5);
        } else {
            for (int i = size+1; i >=index ; i--) {
              elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }
    public   void ensureCapacity(int minCapacity) {
        if(minCapacity>=0) {
            int newSize = this.elements.length+minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        } else {
            throw new IllegalArgumentException("capacity" + minCapacity);
        }
    }
}
