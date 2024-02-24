public class CountingSort {
    public int[] sort(int[] arr){
        int max = findMax(arr);
        int min = findMin(arr);
        int range = max-min+1;
        int count[] = new int[range];
        int result[] = new int[arr.length];
        // Đếm số lần xuất hiện
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        // Tổng tích lũy
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        for (int i = arr.length-1; i >= 0; i--) {
            result[(count[arr[i] - min]-1)] = arr[i];
            count[arr[i]-min]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
        return arr;
    }

    private int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    private int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
