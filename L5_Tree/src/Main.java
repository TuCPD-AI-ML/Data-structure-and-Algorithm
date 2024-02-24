import Bai1.*;
import Bai2.ExpressionTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Bai1_3();
        Bai1_4();
//        Bai2_2();
    }
    static void Bai1_3(){
        ArrayBinaryTree treeArr = new ArrayBinaryTree<>();
        treeArr.setRoot(1);
        treeArr.setLeft(0, 5);
        treeArr.setRight(0, 3);
        treeArr.setLeft(1, 8);
        treeArr.setRight(1, 6);
        treeArr.setLeft(2, 2);
        treeArr.setRight(2, 7);

//        for (int i = 0; i < treeArr.size(); i++) {
//            System.out.println(treeArr.array[i] + "");
//        }

        PrintTreeArray printTree = new PrintTreeArray(treeArr);
        // in ra màn hình
        printTree.printTreeArrayTerminal(0, 0);
        // in ra file txt
        try {
            printTree.printTreeArrayFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void Bai1_4(){
        LinkedListBinaryTree treeLL = new LinkedListBinaryTree();
        treeLL.addRoot(1);
        Node root = treeLL.root();
        treeLL.addLeft(root, 5);
        treeLL.addRight(root, 3);
        treeLL.addLeft(treeLL.left(root), 8);
        treeLL.addRight(treeLL.left(root), 6);
        treeLL.addLeft(treeLL.right(root), 2);
        treeLL.addRight(treeLL.right(root), 7);

        PrintTreeLL printTree = new PrintTreeLL(treeLL);
        printTree.printTreeLLTerminal(root, 0);

        try {
            printTree.printTreeArrayFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void Bai2_2(){
        LinkedListBinaryTree treeLL = new LinkedListBinaryTree();
        treeLL.addRoot('*');
        Node root = treeLL.root();
        treeLL.addLeft(root, '+');
        treeLL.addRight(root, '-');
        treeLL.addLeft(treeLL.left(root), '/');
        treeLL.addRight(treeLL.left(root), 3);
        Node leftChild = treeLL.left(root);
        treeLL.addLeft(treeLL.right(root), 7);
        treeLL.addRight(treeLL.right(root), 4);
        treeLL.addLeft(treeLL.left(leftChild), 6);
        treeLL.addRight(treeLL.left(leftChild), 2);

        ExpressionTree tree = new ExpressionTree();
        System.out.println("Tiền tố: ");
        tree.preorderPrint(root);
        System.out.println("\nHậu tố: ");
        tree.postorderPrint(root);
        System.out.println("\nTrung tố: ");
        tree.inorderPrint(root);

        System.out.println("\nKết quả preorder: "+ tree.BinaryTreeCalculator(root));
    }
}