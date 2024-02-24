//package Bai1;
//public class LLBinaryTree<E, T> extends Node implements BinaryTreeInterface<T>{
//    public LLBinaryTree(Object o, Node above, Node leftChild, Node rightChild) {
//        super(o, above, leftChild, rightChild);
//    }
//
//    @Override
//    public T root() {
//        Node<T> node = this;
//        while (node.parent != null){
//            node = node.parent;
//        }
//        return node.e;
//    }
//
//    @Override
//    public int size() {
//        Node<T> node = (Node<T>) root();
//        return countNode(node);
//    }
//
//    private int countNode(Node node){
//        if(node==null){
//            return 0;
//        }else {
//            int count = 1;
//            count += countNode(node.left);
//            count += countNode(node.right);
//            return count;
//        }
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return (root()==null);
//    }
//
//    @Override
//    public int numChildren(T p) {
//        return 0;
//    }
//
//    @Override
//    public T parent(T p) {
//        if(root() == p) return null;
//        Node<T> curr = (Node<T>) root();
//
//
//    }
//
//    @Override
//    public T left(T p) {
//        return null;
//    }
//
//    @Override
//    public T right(T p) {
//        return null;
//    }
//
//    @Override
//    public T sibling(T p) {
//        return null;
//    }
//}
