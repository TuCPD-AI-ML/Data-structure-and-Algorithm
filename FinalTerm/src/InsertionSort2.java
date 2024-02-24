public class InsertionSort2 {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = binarySearch(arr, key, 0, i - 1);

            // Di chuyển các phần tử lớn hơn key về sau
            System.arraycopy(arr, j, arr, j + 1, i - j);

            // Chèn key vào vị trí đúng
            arr[j] = key;
        }
    }

    // Tìm vị trí chèn phần tử key trong đoạn đã được sắp xếp
    public int binarySearch(int[] arr, int key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
