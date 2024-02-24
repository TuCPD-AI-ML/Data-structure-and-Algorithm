/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk2_applicate_sort;

/**
 *
 * @author TU
 */
public class MergeSortReverse {

    public void mergeSortReverse(int[] arr, int low, int high) {
        long numberCompare = 0;
        long numberSwap = 0;
        long startTime = System.currentTimeMillis();
        if (low < high) { //Kiểm tra nếu low == high(mảng chỉ có một phần tử) thì break
            int mid = (low + high) / 2;

            mergeSortReverse(arr, low, mid);  // Đệ quy hàm sort(tiếp tục chia nhỏ) với mảng các chứa phần tử đứng trước mid
            mergeSortReverse(arr, mid + 1, high); // Tương tự với mảng chứa các phần tử đứng sau mid
            merge(arr, low, mid, high, numberCompare, numberSwap); // ghép hai đã được sắp xếp với nhau
        }
        System.out.println("Numbers of compare: " + numberCompare);
        System.out.println("Numbers of swap: " + numberSwap);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time: " + totalTime * 1000);
    }

    public void merge(int[] arr, int low, int mid, int high, long numberCompare, long numberSwap) {

        int[] arrTemp = new int[arr.length];

        for (int i = low; i <= high; i++) { // sao chép mảng arr[i] vào mảng tạm thời
            arrTemp[i] = arr[i];
        }
        int i = low; // chỉ số đầu vào mảng thứ nhất
        int j = mid + 1; // chỉ số đầu vào mảng thứ hai
        int k = low; // chỉ số đầu vào mảng kết quả 

        while (i <= mid && j <= high) {
            if (arrTemp[i] > arrTemp[j]) { // So sánh lần lượt giá trị phần tử của mảng thứ nhất từ vị trí i và phần tử tại vị trí j của mảng thứ 2 nếu a[i] < a[j]
                numberCompare++;
                arr[k] = arrTemp[i];             // thì lưu a[i] vào mảng kết quả
                i++;                                    // sau đó so sánh phần tử tiếp theo với a[j] 
                numberSwap++;
            } else {
                arr[k] = arrTemp[j];            // còn nếu a[i] > a[j] thì lưu a[j] và so sánh phần tử tiếp theo với a[i]
                j++;
                numberSwap++;
            }
            k++;                                       // Sau đó tăng chỉ số phần tử mảng kết quả
        }

        while (i <= mid) {                      //Nếu một trong hai mảng đã duyệt hết thì chỉ việc lưu các phần tử chưa được duyệt của mảng còn lại
            arr[k] = arrTemp[i];                // vào mảng kết quả( vì mỗi mảng đã được sắp xếp trước khi so sánh) và tăng chỉ số mảng kết quả 
            k++;
            i++;
        }
    }
}
