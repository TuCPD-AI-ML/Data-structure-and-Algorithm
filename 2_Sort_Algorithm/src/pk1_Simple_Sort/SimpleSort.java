/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk1_Simple_Sort;

import java.util.Arrays;

/**
 *
 * @author TU
 */
public class SimpleSort {

    int swap = 0;
    int compare = 0;

// Bubble sort
    public void bubbleSort(int size, int arr[]) {

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap++;
//                    System.out.println("Sap xep lan: " + swap);
//                    System.out.println(Arrays.toString(arr));
                }
                compare++;
            }
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("So lan so sanh: " + compare);
//        System.out.println("So lan doi cho: " + swap);
    }

// Insertion Sort
    public void insertSort(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int next = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > next; --j) {
                compare++;
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = next;
            swap++;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("So lan so sanh: " + compare);
        System.out.println("So lan doi cho: " + swap);
    }

// Selection Sort
    public void selectSort(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                    compare++;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            swap++;
//            System.out.println("Sap xep lan: " + swap);
//            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("So lan so sanh: " + compare);
        System.out.println("So lan doi cho: " + swap);
    }
}
