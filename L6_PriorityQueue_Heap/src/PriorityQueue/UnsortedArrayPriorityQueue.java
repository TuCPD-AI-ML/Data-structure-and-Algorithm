package PriorityQueue;

public class UnsortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {
    protected class ArrEntry<K, E> implements Entry<K, E>{
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

//        @Override
//        public String toString() {
//            return key.toString();
//        }
    }
    ArrEntry<K, E>[] array;
    int n = 0;
    int defaultsize = 1000;

    public UnsortedArrayPriorityQueue() {
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
        array[n] = (ArrEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(Object o, Object o2) {
        Entry<K, E> newEntry = new ArrEntry<>((K) o, (E) o2);
        insert(newEntry);
    }

    @Override
    public Entry removeMin() {
        if(isEmpty()) return null;
        int idxMin = 0; // giả định phần tử nhỏ nhất trong mảng năm ở vị trí không
        // Duyệt qua mảng tìm index của phần tử nhỏ nhất
        for (int i = 0; i < size(); i++) {
            if(array[i].getKey().compareTo(array[idxMin].getKey()) < 0){
                idxMin = i;
            }
        }
        ArrEntry<K, E> minEntry = array[idxMin]; // Tạo biến mới có kiểu Entry để lưu phần tử có giá trị nhỏ nhất
        array[idxMin] = array[size()-1]; // di chuyển phần tử cuối của mảng lên thay thế vị trí của phần tử min
        array[size()-1] = null; // xóa phần tử cuối cùng của mảng
        n--;
        return minEntry;
    }

    @Override
    public Entry min() {
        if(isEmpty()) return null;
        int idxMin = 0;
        for (int i = 0; i < size(); i++) {
            if(array[i].getKey().compareTo(array[idxMin].getKey()) < 0){
                idxMin = i;
            }
        }
        return array[idxMin];
    }
}
