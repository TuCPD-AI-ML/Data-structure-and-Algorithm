package Bai1;

public class LinkedListBinaryTree<E, T> implements LLBinaryTreeInterface<E>{

    private Node<E> root;
    private int size;

    public LinkedListBinaryTree(){
        root = null;
        size = 0;
    }

    @Override
    public Node<E> root() {
        return root;
    }

    @Override
    public int size() {
        return countNode(root);
    }
    private int countNode(Node<E> node){
        if(node==null){
            return 0;
        }
        int count = 1;
        count += countNode(node.left);
        count += countNode(node.right);
        return count;
    }

    @Override
    public boolean isEmpty() {
        return (root == null);
    }

    @Override
    public int numChildren(Node<E> p) {
        if(p==null) return 0;
        if(p == root) return size()-1;
        int count = 0;
        if (p.left != null) {
            count++;
            count += numChildren(p.left);
        }
        if (p.right != null) {
            count++;
            count += numChildren(p.right);
        }
        return count;
    }

    @Override
    public Node<E> parent(Node<E> p) {
        if(root == p) return null;
        return p.parent;
    }

    @Override
    public Node<E> left(Node<E> p) {
        return p.left;
    }

    @Override
    public Node<E> right(Node<E> p) {
        return p.right;
    }

    @Override
    public Node<E> sibling(Node<E> p) {
        Node<E> parent = p.parent;
        if(parent == null) return null;
        if(p == parent.left){
            return  parent.right;
        }else {
            return parent.left;
        }
    }

    public Node<E> addRoot(E e){
        if(!isEmpty()) throw new IllegalArgumentException("root was exist");
        root = new Node<>(e, null, null, null);
        size++;
        return root;
    }

    public Node<E> addLeft(Node<E> p, E e){
        if(p.left != null){
            throw new IllegalArgumentException("left child of p was exist");
        }else {
            Node<E> childLeft = new Node<>(e, p, null, null); // Tạo node con trái có cha là p và giá trị là e
            p.left = childLeft; // set con trai cua p là childLeft
            size++;
            return childLeft;
        }
    }

    public Node<E> addRight(Node<E> p, E e){
        if(p.right != null)
            throw new IllegalArgumentException("right child of p was exist");
        Node<E> childRight = new Node<>(e, p, null, null);
        p.right = childRight;
        size++;
        return childRight;
    }

}
