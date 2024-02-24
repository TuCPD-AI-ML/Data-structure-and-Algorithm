public class BubbleSort2 {
    public void sort(int arr[]) {
        int size = arr.length;
        for(int i=0; i < size; ++i) {
            boolean is_sorted = true;
            for (int j = 1; j < size-i; ++j) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    is_sorted = false;
                }
            }
            if(is_sorted) return;
        }
    }
}
