package Bai1;

public class Node<E> {
    E e;
    Node<E> parent;
    Node<E> left;
    Node<E> right;

    public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
        this.e = e;
        this.parent = above;
        this.left = leftChild;
        this.right = rightChild;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public Node<E> getParent() {
        return parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
}
