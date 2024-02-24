package pkg1_array_operation;

import java.util.Scanner;

/**
 *
 * @author TU
 */
public class Array {
    public int size;
    public Double[] array;
    Scanner scanner = new Scanner(System.in);

    public Array() {
        
    }
            
    public void Input(){
        System.out.println("Nhap vao do dai cua mang: ");
        this.size = scanner.nextInt();
        array = new Double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap vao phan tu thu " + i + ": ");
            array[i] = scanner.nextDouble();
        }
    }
    
    public void Output(){
        System.out.println("Phan tu trong mang");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + "\t");
        }
    }
    
    public void Lists(){
        System.out.println("Nhap vao do dai cua mang: ");
        size= scanner.nextInt();
        double[] myList = new double[size];
        System.out.println("Nhap phan tu cua mang:");
	for (int i = 0; i < myList.length; i++) {
            myList[i] = scanner.nextDouble();
	}
        
        System.out.print("Cac phan tu trong mang: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
	}
    }
}