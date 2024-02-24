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
public class FindMissingNumbers {

    public List<Integer> findMissingNumbers(int[] arr, int a, int b) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, 0, arr.length-1);

        boolean[] marked = new boolean[b - a + 1]; // mảng đánh dấu các phần tử xuất hiện trong mảng A
        
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > b) {
                l = i;
                break;
            }
        }
        System.out.println(l);
        
        for (int i = 0; i < l; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                marked[arr[i] - a] = true; // đánh dấu phần tử A[i] trong mảng B
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < marked.length; i++) {
            if (!marked[i]) {
                result.add(a + i); // lưu giá trị chưa được đánh dấu vào mảng kết quả
            }
        }
        return result;
    }

//    int[] arrTemp = new int[b-a+1];
//    public void findIntMinPlus(int size, int[] arr) {
//
//        BubbleSort bubble = new BubbleSort();
//        bubble.bubbleSort(size, arr);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("Nhap so a, so b: ");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        while (a >= b) {
//            System.out.println("Nhap lai(a<b): ");
//            a = sc.nextInt();
//            b = sc.nextInt();
//        }

////        System.out.println(Arrays.toString(arrTemp));
//
//        for (int k = a; k < b + 1; k++) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != k) {
//                    
//                }
//            }
//        }
//    }
//    public int[] insert(int[] arr, int k) {
//        int arrIndex = arr.length - 1;
//        int tempIndex = arr.length;
//        int[] tempArr = new int[tempIndex + 1];
//        boolean inserted = false;
//
//        for (int i = tempIndex; i >= 0; i--) {
//            if (arrIndex > -1 && arr[arrIndex] > k) {
//                tempArr[i] = arr[arrIndex--];
//            } else {
//                if (!inserted) {
//                    tempArr[i] = k;
//                    inserted = true;
//                } else {
//                    tempArr[i] = arr[arrIndex--];
//                }
//            }
//        }
//        return tempArr;
//    }
}
