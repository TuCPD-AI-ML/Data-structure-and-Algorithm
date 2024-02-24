public class SelectionSort2 {
    public void sort(int[] arr) {
        int n = arr.length;
        int left = 0; // Vị trí bắt đầu của đoạn chưa được sắp xếp
        int right = n - 1; // Vị trí kết thúc của đoạn chưa được sắp xếp

        while (left < right) {
            int minIdx = left;
            int maxIdx = right;

            // Tìm phần tử nhỏ nhất và phần tử lớn nhất trong đoạn chưa được sắp xếp
            for (int i = left; i <= right; i++) {
                if (arr[i] < arr[minIdx]) {
                    minIdx = i;
                }
                if (arr[i] > arr[maxIdx]) {
                    maxIdx = i;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên của đoạn chưa được sắp xếp
            swap(arr, left, minIdx);

            // Nếu phần tử lớn nhất đang ở vị trí đầu tiên, hoán đổi nó với phần tử cuối cùng của đoạn chưa được sắp xếp
            if (maxIdx == left) {
                maxIdx = minIdx;
            }

            // Hoán đổi phần tử lớn nhất với phần tử cuối cùng của đoạn chưa được sắp xếp
            swap(arr, right, maxIdx);

            // Giảm đoạn chưa được sắp xếp bằng cách tăng vị trí bắt đầu và giảm vị trí kết thúc
            left++;
            right--;
        }
    }

    // Phương thức hoán đổi hai phần tử trong mảng
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
