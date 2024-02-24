package pk1_Stack;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    class Node{
        E element;
        Node next;
    }
    private Node stackHead = null;

    @Override
    public void push(E element) {
        Node current = stackHead;
        stackHead = new Node();
        stackHead.element = element;
        stackHead.next = current;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            E e = stackHead.element;
            stackHead = stackHead.next;
            return e;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        if(stackHead == null) return true;
        return false;
    }

    @Override
    public E top() {
        if (!isEmpty()){
            return stackHead.element;
        }
        return null;
    }
}
