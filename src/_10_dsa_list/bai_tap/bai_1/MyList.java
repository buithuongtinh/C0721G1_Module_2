package _10_dsa_list.bai_tap.bai_1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity = " + capacity);
        }
    }
    public int size() {
        return size;
    }
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }

    public boolean add(E element){
        if (size == elements.length) {
            this.ensureCapacity(1);
        }
        elements[size++] = element;
        size++;
        return true;
    }

    public void add( int index,E element ) {
        if (size == elements.length) {
            this.ensureCapacity(1);
        }
        for (int i = size - 1; i >= index; i--) {
            elements[size + 1] = elements[size];
        }
        elements[index] = element;
        size++;
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E) elements[index];
        }
        return null;
    }
    // hàm tìm vị trí
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
    // hàm tìm kiếm có trả về true
    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public MyList<E> clone() {
        MyList<E> cloneElements = new MyList<>();
        cloneElements.elements = Arrays.copyOf(elements, size);
        cloneElements.size = size;
        return cloneElements;
    }
    // remove() xóa phần tử ra khỏi ArrayList
    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }
    public E[] getElement() {
        return (E[]) this.elements;
    }

}
