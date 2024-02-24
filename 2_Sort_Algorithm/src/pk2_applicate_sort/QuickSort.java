/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk2_applicate_sort;

import java.util.ArrayList;

/**
 *
 * @author TU
 */
public class QuickSort {

    public void quickSort(ArrayList<Integer> arr, int low, int high) {
        int pivotIdx;
        if (low < high) {
            pivotIdx = partition(arr, low, high); // dùng điểm pivot để chia mảng thành hai phần

            // Lặp đi lặp lại việc sắp xếp các mảng con
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    private int partition(ArrayList<Integer> arr, int i, int j) {
        int p = arr.get(i);
        int m = i;

        for (int k = i + 1; k <= j; k++) {
            if (arr.get(k) < p) {
                ++m;
                swap(arr, k, m);
            }else{}
        }
        swap(arr, i, m);
        return m;
    }

    private void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
