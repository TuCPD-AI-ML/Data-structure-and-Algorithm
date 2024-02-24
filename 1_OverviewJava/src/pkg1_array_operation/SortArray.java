package pkg1_array_operation;

/**
 *
 * @author TU
 */
public class SortArray extends Array {

    public Double temp;

    public void Sort(int size, Double[] array) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j <= size - 1; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // in ra màn hình mảng số sau khi sắp xếp
        System.out.println("\nMang sau khi sap xep: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
