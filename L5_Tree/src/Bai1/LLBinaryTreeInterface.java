package Bai1;

public interface LLBinaryTreeInterface<E> {
    Node<E> root();
    int size();     // Number of node in tree
    boolean isEmpty();
    int numChildren(Node<E> p); // number of children of element p

    Node<E> parent(Node<E> p); // return parent of p
    Node<E> left(Node<E> p); // return left child of p
    Node<E> right(Node<E> p); // return right child of p
    Node<E> sibling(Node<E> p); //return sibling of p
}
