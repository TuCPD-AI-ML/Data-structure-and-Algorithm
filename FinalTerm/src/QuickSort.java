public class QuickSort {
    public void sort(int[] arr, int low, int high) {
        int pivotIdx;
        if (low < high) {
            pivotIdx = partition(arr, low, high); // dùng điểm pivot để chia mảng thành hai phần

            // Lặp đi lặp lại việc sắp xếp các mảng con
            sort(arr, low, pivotIdx - 1);
            sort(arr, pivotIdx + 1, high);
        }
    }

    private int partition(int[] arr, int i, int j) {
        int p = arr[i];
        int m = i;

        for (int k = i + 1; k <= j; k++) {
            if (arr[k] < p) {
                ++m;
                swap(arr, k, m);
            }else{}
        }
        swap(arr, i, m);
        return m;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
