package Bai1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class PrintTreeArray {
    private ArrayBinaryTree treeArray;
    public PrintTreeArray(ArrayBinaryTree treeArray) {
        this.treeArray = treeArray;
    }
//    public void printTreeArrayTerminal(ArrayBinaryTree tree){
//        printTreeArrayTerminal(0, 0, tree.array);
//    }
    public void printTreeArrayTerminal(int t, int level){
        if(treeArray.array[t] != null){
            printTreeArrayTerminal(2*t+2, level+1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(treeArray.array[t]+"\n");
            printTreeArrayTerminal(2*t+1, level+1);
        }
    }

    public void printTreeArrayFile() throws IOException {
        File outputFile = new File("output.txt"); // tạo đối tượng File
        FileWriter fileWriter = new FileWriter(outputFile); // tạo đối tượng FileWriter để ghi dữ liệu vào file output.txt thông qua outputFile
        PrintWriter printWriter = new PrintWriter(fileWriter); // tạo đối tượng PrintWriter để in dữ liệu bằng cách ghi dữ liệu vào file
        printTreeArrayFile(0, 0, printWriter);
        printWriter.close();
        System.out.println("Binary tree printed file output.txt");
    }

    private void printTreeArrayFile(int t, int level, PrintWriter printWriter) {
        if (treeArray.array[t] != null) {
            printTreeArrayFile(2*t+2, level+1, printWriter);
            for (int i = 0; i < level; i++) {
                printWriter.print("\t");
            }
            printWriter.println(treeArray.array[t]+"\n");
            printTreeArrayFile(2*t+1, level+1, printWriter);
        }
    }
}

