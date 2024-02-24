/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk1_Simple_Sort;

import java.util.Arrays;

/**
 *
 * @author TU
 * @param <T>
 */
public class SortTObj<T> implements Comparable<SortTObj> {

    // Bubble sort
    protected <T> void swap(T[] values, int first, int second) {                                    // Đổi chỗ 
        T temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }

    public <T extends Comparable<T>> void bubleSortAscending(T[] values) {                   // sắp xếp tăng dần
        bubleSort(values, 0, 1);
    }

    public <T extends Comparable<T>> void bubleSortDescending(T[] values) {                  // Sắp xếp giảm dần
        bubleSort(values, 1, 0);
    }

    private <T extends Comparable<T>> void bubleSort(T[] values, int first, int second) {
        int numberSwap = 0;
        int numberCompare = 0;
        boolean isOrdered;

        for (int i = 1; i < values.length; i++) {
            isOrdered = true;

            for (int j = 0; j < values.length - i; j++) {
                if (values[j + first].compareTo(values[j + second]) > 0) {
                    numberCompare++;
                    isOrdered = false;
                    swap(values, j + first, j + second);
                    numberSwap++;
                }
            }
            if (isOrdered) {
                break;
            }
        }
        System.out.println(Arrays.toString(values));
        System.out.printf("\nNumber compare: " + numberCompare);
        System.out.printf("\nNumber swap: " + numberSwap);
    }

    // Selection sort
    public <T extends Comparable<T>> void selectSort(T[] values) {
        int numberSwap = 0;
        int numberCompare = 0;

        for (int i = 0; i < values.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j].compareTo(values[minIdx]) < 0) {
                    minIdx = j;
                    numberCompare++;
                }
            }
            swap(values, i, minIdx);
            numberSwap++;
        }
        System.out.printf("\nNumber compare: " + numberCompare);
        System.out.printf("\nNumber swap: " + numberSwap);
    }

    //Insertion sort
    public <T extends Comparable<T>> void insertSort(T[] values) {
        int numberSwap = 0;
        int numberCompare = 0;

        for (int i = 0; i < values.length; i++) {
            T next = values[i];
            int j;
            for (j = i - 1; j >= 0 && (values[j].compareTo(next) > 0); --j) {
                numberCompare++;
                values[j + 1] = values[j];
            }
            values[j + 1] = next;
            numberSwap++;
        }
        System.out.printf("\nNumber compare: " + numberCompare);
        System.out.printf("\nNumber swap: " + numberSwap);
    }

    @Override
    public int compareTo(SortTObj o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
