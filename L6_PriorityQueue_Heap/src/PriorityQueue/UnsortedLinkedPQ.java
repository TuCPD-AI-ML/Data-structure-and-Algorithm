package PriorityQueue;

public class UnsortedLinkedPQ<K extends Comparable, E> implements PriorityQueueInterface{
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
        if(isEmpty()){
            head = tail = (NodeEntry<K, E>) entry;
        }
        tail.next = (NodeEntry<K, E>) entry;
        tail = (NodeEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(Object o, Object o2) {
        NodeEntry<K, E> newNode = new NodeEntry<K, E>((K) o, (E) o2);
        insert(newNode);
    }

    @Override
    public Entry removeMin() {
        if(isEmpty()) return null;
        NodeEntry<K, E>  minValue = head;
        NodeEntry<K, E> current = head.next;
        NodeEntry<K, E> prevMin = null;
        NodeEntry<K, E> prevCur = null;
        while (current != null){
            if(current.getKey().compareTo(minValue.getKey())<0){
                minValue = current;
                prevMin = prevCur;
            }
            prevCur = current;
            current = current.next;
        }
        if(minValue==head){
            head = head.next;
        }else if (minValue==tail){
            prevMin.next = null;
            tail = prevMin;
        }else {
            prevMin.next = minValue.next;
        }
        n--;
        return minValue;
    }

    @Override
    public Entry min() {
        if(isEmpty()) return null;
        NodeEntry<K, E>  minValue = head;
        NodeEntry<K, E> current = head.next;
        while (current != null){
            if(current.getKey().compareTo(minValue.getKey())<0){
                minValue = current;
            }
            current = current.next;
        }
        return minValue;
    }
}

