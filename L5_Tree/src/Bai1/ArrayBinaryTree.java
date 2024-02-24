package Bai1;
public class ArrayBinaryTree<E, T> implements BinaryTreeInterface{
    public E [] array;
    private int n = 0;
    private int defaultsize = 100;
    public ArrayBinaryTree(){
        array = (E[]) new Object[defaultsize];
    }

    @Override
    public Object root() {
        return array[0];
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return (size()==-1);
    }

    @Override
    public int numChildren(Object p) {
        int count = 0;
        int idx = (Integer) p;
        if(idx > defaultsize) return count;
        int leftChildIdx = 2*idx+1;
        int rightChildIdx = 2*idx+2;
        if(array[idx] != null){
            if(leftChildIdx<defaultsize && array[leftChildIdx]!=null){
               count++;
               count+= numChildren(leftChildIdx);
            }
            if(rightChildIdx<defaultsize && array[rightChildIdx]!=null){
                count++;
                count+= numChildren(rightChildIdx);
            }
        }
        return count;
    }

    @Override
    public Object parent(Object p) {
        if((Integer) p==0) {
            throw new IndexOutOfBoundsException("p is root");
        }
        int parentIdx = ((Integer) p - 1)/2;
        return array[parentIdx];
    }

    @Override
    public Object left(Object p) {
       int pIdx = (Integer) p;
       int leftIdx = 2*pIdx+1;
       if(leftIdx > defaultsize || array[leftIdx]==null) throw new IndexOutOfBoundsException("Left child of p isn't exist");
       else
           return array[leftIdx];
    }

    @Override
    public Object right(Object p) {
        int pIdx = (Integer) p;
        int rightIdx = 2*pIdx+2;
        if(rightIdx > defaultsize || array[rightIdx]==null) throw new IndexOutOfBoundsException("Right child of p isn't exist");
        else
            return array[rightIdx];
    }

    @Override
    public Object sibling(Object p) {
        int pIdx = (Integer) p;
        if(pIdx == 0) throw new IndexOutOfBoundsException("p is root, haven't sibling");
        float parentIdx = (pIdx-1)/2;
        int siblingIdx;
        if(parentIdx%2 == 0){
            siblingIdx = pIdx+1;
        }else
            siblingIdx = pIdx-1;
        if(siblingIdx>defaultsize ||array[siblingIdx] == null)
            return null;
        return array[siblingIdx];
    }

    public void setRoot(E element){
        array[0] = element;
        n++;
    }

    public void setLeft(int pIdx, E element){ //pIdx is index of node pIdx in array
        int leftIdx = 2*pIdx+1; //calculator index of left child
        // Check over capacity
        if(leftIdx > defaultsize){
            return;
        }
        array[leftIdx] = element; // if existed, assign value element in index leftIdx
        n++;
    }

    public void setRight(int pIdx, E element){
        int rightIdx = 2*pIdx+2;
        if(rightIdx > defaultsize) return;
        array[rightIdx]=element;
        n++;
    }
}
