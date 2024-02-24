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
public class CountElementLarger {

    QuickSort quick = new QuickSort();

    public void countElementLarger(ArrayList<Integer> arr) {
        quick.quickSort(arr, 0, arr.size() - 1);
        for (int i = 0; i < arr.size()-1; i++) {
            System.out.println("\n Element larger than arr[" + i+"]: ");
            for (int j = i + 1; j < arr.size(); j++) {
                System.out.print(arr.get(j) + " ");

            }
        }
    }
}
