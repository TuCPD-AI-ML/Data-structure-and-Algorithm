import java.util.Random;
public class QuickSort2 {
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIdx = randomPartition(arr, low, high); // Chọn điểm pivot ngẫu nhiên từ mảng

            sort(arr, low, pivotIdx - 1); // Sắp xếp phần trước pivot
            sort(arr, pivotIdx + 1, high); // Sắp xếp phần sau pivot
        }
    }

    private int randomPartition(int[] arr, int low, int high) {
        Random random = new Random();
        int randomIdx = random.nextInt(high - low + 1) + low; // Chọn ngẫu nhiên một chỉ số từ low đến high
        swap(arr, randomIdx, high); // Hoán đổi giá trị của phần tử ngẫu nhiên với phần tử cuối cùng (pivot)
        return partition(arr, low, high); // Áp dụng phân hoạch cho mảng đã hoán đổi
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Chọn pivot là phần tử cuối cùng
        int i = low - 1; // Chỉ số i để duyệt qua các phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // Nếu phần tử đang xét nhỏ hơn pivot
                i++;
                swap(arr, i, j); // Hoán đổi phần tử nhỏ hơn pivot với phần tử tại chỉ số i
            }
        }

        swap(arr, i + 1, high); // Đưa pivot về vị trí đúng trong mảng đã phân hoạch
        return i + 1; // Trả về chỉ số của pivot
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
