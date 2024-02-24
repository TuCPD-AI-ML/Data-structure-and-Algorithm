package Heap;

import PriorityQueue.SortedArrayPriorityQueue;

import java.util.ArrayList;

public class CompareSort {
    public void HeapSort(int[] arr){
        long startTime = System.currentTimeMillis();
        MinHeapPriorityQueue<Integer, Integer> heapSort = new MinHeapPriorityQueue<>();
        for (int num: arr) {
            heapSort.insert(num, num);
        }

        int i = 0;
        while (!heapSort.isEmpty()){
            MinHeapPriorityQueue.ArrEntry entry = (MinHeapPriorityQueue.ArrEntry) heapSort.removeMin();
            arr[i++] = (int) entry.getValue();
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time HeapSort: " + totalTime);
    }
    public void mergeSort(int[] arr, int low, int high) {
        long startTime = System.currentTimeMillis();
        if (low < high) { //Kiểm tra nếu low == high(mảng chỉ có một phần tử) thì break
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);  // Đệ quy hàm sort(tiếp tục chia nhỏ) với mảng các chứa phần tử đứng trước mid
            mergeSort(arr, mid + 1, high); // Tương tự với mảng chứa các phần tử đứng sau mid
            merge(arr, low, mid, high); // ghép hai đã được sắp xếp với nhau
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time MergeSort: " + totalTime);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int[] arrTemp = new int[arr.length];

        for (int i = low; i <= high; i++) { // sao chép mảng arr[i] vào mảng tạm thời
            arrTemp[i] = arr[i];
        }
        int i = low; // chỉ số đầu vào mảng thứ nhất
        int j = mid + 1; // chỉ số đầu vào mảng thứ hai
        int k = low; // chỉ số đầu vào mảng kết quả

        while (i <= mid && j <= high) {
            if (arrTemp[i] <= arrTemp[j]) { // So sánh lần lượt giá trị phần tử của mảng thứ nhất từ vị trí i và phần tử tại vị trí j của mảng thứ 2 nếu a[i] < a[j]
                arr[k] = arrTemp[i];             // thì lưu a[i] vào mảng kết quả
                i++;                                    // sau đó so sánh phần tử tiếp theo với a[j]
            } else {
                arr[k] = arrTemp[j];            // còn nếu a[i] > a[j] thì lưu a[j] và so sánh phần tử tiếp theo với a[i]
                j++;
            }
            k++;                                       // Sau đó tăng chỉ số phần tử mảng kết quả
        }

        while (i <= mid) {                      //Nếu một trong hai mảng đã duyệt hết thì chỉ việc lưu các phần tử chưa được duyệt của mảng còn lại
            arr[k] = arrTemp[i];                // vào mảng kết quả( vì mỗi mảng đã được sắp xếp trước khi so sánh) và tăng chỉ số mảng kết quả
            k++;
            i++;
        }
    }

    public void quickSort(int[] arr, int low, int high) {
        long startTime = System.currentTimeMillis();
        int pivotIdx;
        if (low < high) {
            pivotIdx = partition(arr, low, high); // dùng điểm pivot để chia mảng thành hai phần

            // Lặp đi lặp lại việc sắp xếp các mảng con
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time QuickSort: " + totalTime);
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

    public void selectSort(int n, int[] arr) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time SelectionSort: " + totalTime);
    }

}
