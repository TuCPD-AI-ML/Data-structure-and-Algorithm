package Heap;

import PriorityQueue.Entry;
import PriorityQueue.SortedArrayPriorityQueue;

public class MinHeapPriorityQueue<K extends Comparable<K>, E> extends SortedArrayPriorityQueue<K, E>{
    ArrEntry<K, E>[] heapPQ;
    int n=0;
    int defausize = 1000000;
    public MinHeapPriorityQueue(){
        heapPQ = new ArrEntry[defausize];
    }
    private int left(int i){
        return 2*i+1;
    }

    private int right(int i){
        return 2*i+2;
    }

    private int parent(int i){
        return (i-1)/2;
    }

    private void swap(int i, int j){
        ArrEntry temp = heapPQ[i];
        heapPQ[i] = heapPQ[j];
        heapPQ[j] = temp;
    }

    private boolean isLeaf(int i){
        return left(i)<=size() || right(i)<=size();
    }
    protected void upHeap(){
        int i = n-1;
        while (i>0 && heapPQ[i].getKey().compareTo(heapPQ[parent(i)].getKey()) < 0){
            swap(i, parent(i));
            i = parent(i);
        }
    }

    protected void downHeap(){
        int i = 0;
        while (isLeaf(i)){
            int min = left(i);
            if(right(i)<size() && heapPQ[right(i)].getKey().compareTo(heapPQ[left(i)].getKey())<0){
                min = right(i);
            }
            if(heapPQ[i].getKey().compareTo(heapPQ[min].getKey())<= 0) return;
            swap(i, min);
            i = min;
        }
    }

    @Override
    public void insert(Entry entry) {
        K key = (K) entry.getKey();
        int i = size()-1;
        while(i>=0 && key.compareTo(heapPQ[i].getKey()) < 0){
            heapPQ[i+1] = heapPQ[i];
            i--;
        }
        heapPQ[i+1] = (ArrEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(Object o, Object o2) {
        Entry<K, E> newEntry = new ArrEntry<>((K) o, (E) o2);
        insert(newEntry);
        upHeap();
    }

    @Override
    public Entry removeMin() {
        if(isEmpty()) return null;
        ArrEntry<K, E> minEntry = heapPQ[0];
        heapPQ[0] = heapPQ[n-1];
        heapPQ[n-1]=null;
        n--;
        downHeap();
        return minEntry;
    }
}
