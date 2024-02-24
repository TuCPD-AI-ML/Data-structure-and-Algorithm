package PriorityQueue;

public class SortedLinkedPQ<K extends Comparable, E> implements PriorityQueueInterface{
    protected class NodeEntry<K, E> implements Entry<K, E>{
        private K key;
        private E element;
        private NodeEntry<K, E> next;
        public NodeEntry(K k, E e){
            this.key = k;
            this.element = e;
        }
        @Override
        public K getKey() {
            return key;
        }

        @Override
        public E getValue() {
            return element;
        }
    }
    private NodeEntry<K, E> head;
    private NodeEntry<K, E> tail;
    int n = 0;
    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void insert(Entry entry) {
        K keyEntry = (K) entry.getKey();
        NodeEntry<K, E> newEntry = new NodeEntry<>(keyEntry, (E) entry.getValue());
        NodeEntry<K, E> prev = null;
        NodeEntry<K, E> current = head;
        while (current!=null && current.getKey().compareTo(keyEntry) < 0){
            prev = current;
            current = current.next;
        }
        if(prev == null){
            newEntry.next = head;
            head = newEntry;
        }else {
            prev.next = newEntry;
            newEntry.next = current;
        }
        n++;
    }

    @Override
    public void insert(Object o, Object o2) {
        Entry entry = new NodeEntry((K) o, (E) o2);
        insert(entry);
    }

    @Override
    public Entry removeMin() {
        if(isEmpty()) return null;
        NodeEntry<K, E> removed = head;
        head = head.next;
        n--;
        return removed;
    }

    @Override
    public Entry min() {
        if (isEmpty()) return null;
        return head;
    }
}
