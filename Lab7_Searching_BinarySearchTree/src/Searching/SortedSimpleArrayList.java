package Searching;

import java.util.Iterator;

public class SortedSimpleArrayList<T extends Comparable<T>> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultsize = 100;

    public SortedSimpleArrayList() {
        array = (T[]) new Object[defaultsize];
    }

    public SortedSimpleArrayList(int capacity) {
        T[] newArray = (T[]) new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public void add(T data) {
        if(n==0) array[n] = data;
        for (int i = 0; i < n; i++) {
            if(data.compareTo(array[i])>0){
                swap(data, array[i]);
            }
        }
    }
    private void swap(T x, T y){
        T temp = x;
        x = y;
        y = temp;
    }

    @Override
    public T get(int i) {
        return array[i];
    }

    @Override
    public void set(int i, T data) {

    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void isContain(T data) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
