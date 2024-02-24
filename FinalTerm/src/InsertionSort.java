public class InsertionSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int next = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > next; --j) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = next;
        }
    }
}
