/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk2_applicate_sort;

import pk1_Simple_Sort.SimpleSort;

/**
 *
 * @author TU
 */
public class FindIntegerMin {

    public void findIntMin(int size, int[] array) {
        SimpleSort bubble = new SimpleSort();
        bubble.bubbleSort(size, array);
        for (int i = 0; i < size; i++) {
            if (array[i + 1] != array[i] + 1) {
                System.out.println(array[i] + 1);
                break;
            }

        }
    }
}
