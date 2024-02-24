package pk1_Stack;

import java.util.Iterator;

public class ArrayStack<E> implements StackInterface<E> {
    public static final int CAPACITY = 1000; //Độ dài mảng mặc định
    private E[] data; // mảng generic được sử dụng để lưu trữ
    private int t = -1; //Chỉ số của phần tử top trong stack

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }
    public int size(){
        return (t+1);
    }
    @Override
    public boolean isEmpty(){
        return (t == -1);
    }
    @Override
    public void push(E e) throws IllegalStateException{
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[t++] = e;
    }

    @Override
    public E top() {
        if(isEmpty()) return null;
        return data[t];
    }

    @Override
    public E pop() {
        if(isEmpty()) return null;
        E ans = data[t];
        data[t] = null;
        t--;
        return ans;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
