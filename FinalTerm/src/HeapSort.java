public class HeapSort {
    public void sort(int[] arr){
        int n = arr.length;
        for (int i = n/2-1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Sắp xếp từng phần tử trong heap
        for (int i = n-1; i > 0; i--) {
            // Di chuyển gốc của heap đến vị trí cuối mảng
            swap(arr,0, i);
            // gọi đến heapify trên heap đã giảm đi một phần tử
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i){
        int largest = i; // gán nút gốc là nút lớn nhất
        int left = 2*i+1; // Vị trí nút con bên trái
        int right = 2*i+2;

        // so sánh nút con trái với nút gốc
        if(left<n && arr[left]>arr[largest]){
            largest = left; // nếu giá trị con trái lớn hơn giá trị max, gán vị tri max là left
        }

        // so sánh nút con phải với nút lớn nhất
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }

        //Nếu nút lớn nhất không phải là nút gốc
        if(largest != i){
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
