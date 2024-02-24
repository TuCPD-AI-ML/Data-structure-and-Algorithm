/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk2_applicate_sort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TU
 */
public class FindIntInPosK {

    public int finIntegerKPosision(int arr[], int a, int b, int k) {
        MergeSort merge = new MergeSort();
        merge.mergeSort(arr, b, b);

        boolean[] marked = new boolean[b - a + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                marked[arr[i] - a] = true; // đánh dấu phần tử A[i] trong mảng B
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < marked.length; i++) {
            if (!marked[i]) {
                result.add(a + i); // lưu giá trị được đánh dấu vào mảng kết quả
            }
        }
        System.out.println(result);

        int j = 0;
        int posK;
        for (int idx = 0; idx < result.size(); idx++) {
            j++;
            if (j == k) {
                posK = result.get(idx);
                System.out.println(posK);
                break;
            }
            if (k > result.size()) {
                System.out.println(-1);
                break;
            }
        }
        return -1;
    }
}
