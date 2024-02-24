package PriorityQueue;

public class SortedArrayPriorityQueue<K extends Comparable<K>, E> implements PriorityQueueInterface{
    public class ArrEntry<K, E> implements Entry<K, E>{
        K key;
        E element;
        public ArrEntry(K k, E e){
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
    ArrEntry<K, E>[] array;
    int n = 0;
    int defaultsize = 1000;

    public SortedArrayPriorityQueue(){
        array = (ArrEntry<K, E>[]) new ArrEntry[defaultsize];
    }
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
        K key = (K) entry.getKey();
        int i = size()-1;
        while(i>=0 && key.compareTo(array[i].getKey()) < 0){
            array[i+1] = array[i];
            i--;
        }
        array[i+1] = (ArrEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(Object o, Object o2) {
        ArrEntry<K, E> newEntry = new ArrEntry<>((K) o, (E) o2);
        insert(newEntry);
    }

    @Override
    public Entry removeMin() {
        if(isEmpty()) return null;
        ArrEntry<K, E> minValue = array[0];
        for (int i = 0; i < size(); i++) {
            array[i] = array[i+1];
        }
        n--;
        return minValue;
    }

    @Override
    public Entry min() {
        if(isEmpty()) return null;
        return array[0];
    }
}
