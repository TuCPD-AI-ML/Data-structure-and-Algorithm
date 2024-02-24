/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk1_Simple_Sort;

import java.util.Scanner;

/**
 *
 * @author TU
 */
public class Array {

    public int size;
    public int[] array;
    Scanner scanner = new Scanner(System.in);

    public Array() {

    }

    public Array(int size, int[] array) {
        this.size = size;
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void input() {
        System.out.println("Nhap vao do dai cua mang: ");
        this.size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap vao phan tu thu " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
