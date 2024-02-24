package Bai2;

import Bai1.LinkedListBinaryTree;
import Bai1.Node;

public class ExpressionTree<E> extends LinkedListBinaryTree {
    public void preorderPrint(Node<E> p){
        if(p != null) {
            System.out.print(p.getE() + " ");
            preorderPrint(p.getLeft());
            preorderPrint(p.getRight());
        }
    }

    public void postorderPrint(Node<E> p){
        if(p != null){
            postorderPrint(p.getLeft());
            postorderPrint(p.getRight());
            System.out.print(p.getE()+" ");
        }
    }

    public void inorderPrint(Node<E> p){
        if(p != null){
            inorderPrint(p.getLeft());
            System.out.print(p.getE()+" ");
            inorderPrint(p.getRight());
        }
    }

    public int BinaryTreeCalculator(Node<E> p){
        if(p == null) return 0;
        if(p.getRight() == null && p.getLeft() == null) return (int) p.getE();
        int leftResult = BinaryTreeCalculator(p.getLeft());
        int rightResult = BinaryTreeCalculator(p.getRight());
        switch ((char) p.getE()){
            case '+':
                return  leftResult+rightResult;
            case '-':
                return  leftResult-rightResult;
            case '*':
                return  leftResult*rightResult;
            case '/':
                return  leftResult/rightResult;
            default:
                throw new IllegalArgumentException("Invalid char");
        }
    }
}
