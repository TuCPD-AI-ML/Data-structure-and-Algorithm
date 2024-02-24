package pk2_Queue;

import java.util.Iterator;

public class ArrayQueue<E> implements QueueInterface<E> {

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private E[] queue;
    private int n;
    private int top = 0;
    private int count = 0;
    private int defautl_size = 100;

    public ArrayQueue(int capacity) {
        n = capacity;
        queue = (E[]) new Object[capacity];
    }

    public ArrayQueue(){
        n = defautl_size;
        queue = (E[]) new Object[defautl_size];
    }

    @Override
    public void enqueue(E e) {
        if(n == queue.length){throw new IllegalStateException("Queue is full");}
        int avail = (top+n)% queue.length;
        queue[avail] = e;
        n++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()) return null;
        E answer = queue[top];
        queue[top] = null;
        top = (top+1)% queue.length;
        n--;
        return answer;
    }

    @Override
    public boolean isEmpty() {
        return (n==0);
    }
}
