package pk2_Queue;

public interface QueueInterface<E> extends Iterable<E> {
    public void enqueue(E e);
    public E dequeue();
    public boolean isEmpty();
}
