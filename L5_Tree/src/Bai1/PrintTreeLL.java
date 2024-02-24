package Bai1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintTreeLL {
    private LinkedListBinaryTree treeLL;

    public PrintTreeLL(LinkedListBinaryTree treeLL) {
        this.treeLL = treeLL;
    }

    public void printTreeLLTerminal(Node t, int level){
        if(t != null){
            printTreeLLTerminal(t.right, level+1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(t.e + "\n");
            printTreeLLTerminal(t.left, level+1);
        }
    }

    public void printTreeArrayFile() throws IOException {
        File outputFile = new File("outputLL.txt"); // tạo đối tượng File
        FileWriter fileWriter = new FileWriter(outputFile); // tạo đối tượng FileWriter để ghi dữ liệu vào file output.txt thông qua outputFile
        PrintWriter printWriter = new PrintWriter(fileWriter); // tạo đối tượng PrintWriter để in dữ liệu bằng cách ghi dữ liệu vào file
        printTreeLLFile(treeLL.root(), 0, printWriter);
        printWriter.close();
        System.out.println("Binary tree printed file output.txt");
    }

    public void printTreeLLFile(Node t, int level, PrintWriter printWriter){
        if(t != null){
            printTreeLLFile(t.right, level+1, printWriter);
            for (int i = 0; i < level; i++) {
                printWriter.print("\t");
            }
            printWriter.println(t.e + "\n");
            printTreeLLFile(t.left, level+1, printWriter);
        }
    }
}
