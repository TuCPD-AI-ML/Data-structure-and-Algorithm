package Searching;

import java.util.Arrays;
import java.util.Iterator;

public class UnsortedSimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultsize = 100;

    public UnsortedSimpleArrayList() {
        array = (T[]) new Object[defaultsize];
    }

    public UnsortedSimpleArrayList(int capacity) {
        T[] newArray = (T[]) new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void add(T data) {
        array[n] = data;
        n++;
    }

    public T get(int i) {
        return array[i];
    }

    public void set(int i, T data) {
        array[i] = data;
    }

    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)){
                array[i] = array[i + 1];
            }
        }
        array[n - 1] = null;
        n--;
    }

    public void isContain(T data) {
        int label = 0;
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                label = 1;
                System.out.println("Phan tu da xuat hien");
            } else {
                System.out.println("Phan tu xuat hien lan dau");
            }
        }
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Iterator<T> iterator() {
        Iterator itr = Arrays.stream(array).iterator();
        while (itr.hasNext()){
            Object data = itr.next();
            System.out.println(data);
        }
        return itr;
    }
}

