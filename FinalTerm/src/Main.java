import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class Main {
    public static void main(String[] args) {
//        bubble();
//        bubble2();
//        selection();
//        selection2();
//        insertion();
//        insertion2();
//        merge();
//        quick();
//        quick2();
//        heap();
        counting();
//        radix();
    }

    static int[] rand(){
        int[] arr = new int[100000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }
        return arr;
    }

    static void bubble(){
        int[] arr = rand();
        long memoryInitial = getUsedMemory();
        long startTime = System.currentTimeMillis();
        BubbleSort check = new BubbleSort();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Bubble: " + totalTime + " ms");
        long memoryAfter = getUsedMemory();
        long memoryUsed = memoryAfter - memoryInitial;
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }
    static void bubble2(){
        int[] arr = rand();
        long memoryInitial = getUsedMemory();
        long startTime = System.currentTimeMillis();
        BubbleSort2 check = new BubbleSort2();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Bubble2: " + totalTime + " ms");
        long memoryAfter = getUsedMemory();
        long memoryUsed = memoryAfter - memoryInitial;
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void insertion(){
        int[] arr = rand();
        long memoryInitial = getUsedMemory();
        long startTime = System.currentTimeMillis();
        InsertionSort check = new InsertionSort();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Insert: " + totalTime + " ms");
        long memoryAfter = getUsedMemory();
        long memoryUsed = memoryAfter - memoryInitial;
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void insertion2(){
        int[] arr = rand();
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage memoryInitial = memoryBean.getHeapMemoryUsage();
        long startTime = System.currentTimeMillis();
        InsertionSort2 check = new InsertionSort2();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Insert2: " + totalTime + " ms");
        MemoryUsage memoryAfter = memoryBean.getHeapMemoryUsage();
        long memoryUsed = memoryAfter.getUsed() - memoryInitial.getUsed();
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void selection(){
        int[] arr = rand();
        long memoryInitial = getUsedMemory();
        long startTime = System.currentTimeMillis();
        SelectionSort check = new SelectionSort();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Selection: " + totalTime + " ms");
        long memoryAfter = getUsedMemory();
        long memoryUsed = memoryAfter - memoryInitial;
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void selection2(){
        int[] arr = rand();
        long memoryInitial = getUsedMemory();
        long startTime = System.currentTimeMillis();
        SelectionSort2 check = new SelectionSort2();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Selection2: " + totalTime + " ms");
        long memoryAfter = getUsedMemory();
        long memoryUsed = memoryAfter - memoryInitial;
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void merge(){
        int[] arr = rand();
//        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
//        MemoryUsage memoryInitial = memoryBean.getHeapMemoryUsage();
        long startTime = System.currentTimeMillis();
        MergeSort check = new MergeSort();
        check.sort(arr, 0, arr.length-1);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Merge: " + totalTime + " ms");
//        MemoryUsage memoryAfter = memoryBean.getHeapMemoryUsage();
//        long memoryUsed = memoryAfter.getUsed() - memoryInitial.getUsed();
//        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void quick(){
        int[] arr = rand();
//        long memoryInitial = getUsedMemory();
        long startTime = System.currentTimeMillis();
        QuickSort check = new QuickSort();
        check.sort(arr, 0, arr.length-1);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Quick: " + totalTime + " ms");
//        long memoryAfter = getUsedMemory();
//        long memoryUsed = memoryAfter - memoryInitial;
//        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void quick2(){
        int[] arr = rand();
        long memoryInitial = getUsedMemory();
        long startTime = System.currentTimeMillis();
        QuickSort2 check = new QuickSort2();
        check.sort(arr, 0, arr.length-1);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Quick2: " + totalTime + " ms");
        long memoryAfter = getUsedMemory();
        long memoryUsed = memoryAfter - memoryInitial;
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void heap(){
        int[] arr = rand();
//        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
//        MemoryUsage memoryInitial = memoryBean.getHeapMemoryUsage();
        long startTime = System.currentTimeMillis();
        HeapSort check = new HeapSort();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Heap: " + totalTime + " ms");
//        MemoryUsage memoryAfter = memoryBean.getHeapMemoryUsage();
//        long memoryUsed = memoryAfter.getUsed() - memoryInitial.getUsed();
//        System.out.println("Memory used: " + memoryAfter.getUsed() + " bytes");
        System.out.println("-------------------------------------------");
    }

    static void counting(){
        int[] arr = rand();
//        long memoryInitial = getUsedMemory();
        long startTime = System.currentTimeMillis();
        CountingSort check = new CountingSort();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Counting: " + totalTime + " ms");
//        long memoryAfter = getUsedMemory();
//        long memoryUsed = memoryAfter - memoryInitial;
//        System.out.println("Memory used: " + memoryUsed + " bytes");
//        for (int i = 0; i < arr.length-1; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println("-------------------------------------------");
    }

    static void radix(){
        int[] arr = rand();
        long memoryInitial = getUsedMemory();
//        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
//        MemoryUsage memoryInitial = memoryBean.getNonHeapMemoryUsage();
        long startTime = System.currentTimeMillis();
        RadixSort check = new RadixSort();
        check.sort(arr);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time Radix: " + totalTime + " ms");
        long memoryAfter = getUsedMemory();
        long memoryUsed = memoryAfter - memoryInitial;
//        MemoryUsage memoryAfter = memoryBean.getHeapMemoryUsage();
//        long memoryUsed = memoryAfter.getUsed() - memoryInitial.getUsed();
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("-------------------------------------------");
    }
    static long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}