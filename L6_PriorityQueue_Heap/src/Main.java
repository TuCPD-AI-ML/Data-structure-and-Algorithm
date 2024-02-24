import Heap.CompareSort;
import PriorityQueue.TestPQ;
import PriorityQueue.TestPriorityQueueInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Bai1_1();
//        Bai1_2();
//        Bai1_3();
//        Bai1_4();
        Bai3();
    }
    static void Bai1_1(){
        TestPriorityQueueInteger  test = new TestPriorityQueueInteger();
        test.testUnsortedArray();

        TestPQ testPQ = new TestPQ();
        testPQ.testUnsortedArray();
    }

    static void Bai1_2(){
        TestPriorityQueueInteger test = new TestPriorityQueueInteger();
        test.testSortArray();

        TestPQ testPQ = new TestPQ();
        testPQ.testSortArray();
    }

    static void Bai1_3(){
        TestPriorityQueueInteger test = new TestPriorityQueueInteger();
        test.testUnsortedLinked();

        TestPQ testPQ = new TestPQ();
        testPQ.testUnsortedLinked();
    }

    static void Bai1_4(){
        TestPriorityQueueInteger test = new TestPriorityQueueInteger();
        test.testSortedLinked();

        TestPQ testPQ = new TestPQ();
        testPQ.testSortedLinked();
    }

    static void Bai3(){
        int[] arr1 = random();
        int[] arr2 = random();
        int[] arr3 = random();
        int[] arr4 = random();

        CompareSort test = new CompareSort();
        // Test HeapSort
//        test.HeapSort(arr1);

        // Test MergeSort
        test.mergeSort(arr2, 0, arr2.length-1);


        // Test QuickSort
        test.quickSort(arr3, 0, arr3.length-1);

        //Test SelectionSort
        test.selectSort(arr4.length, arr4);
    }

    static int[] random(){
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}