package PriorityQueue;

public class TestPriorityQueueInteger {
    public void testUnsortedArray(){
        UnsortedArrayPriorityQueue testQueue = new UnsortedArrayPriorityQueue();
        testQueue.insert(0, 0);
        testQueue.insert(2, 2);
        testQueue.insert(1, 1);
        testQueue.insert(4, 4);
        testQueue.insert(3, 3);
        testQueue.insert(5, 5);

        System.out.println("Array: ");
        for (int i = 0; i < testQueue.size(); i++) {
            System.out.print(testQueue.array[i].getValue() + " ");
        }
        System.out.println("\nKich thuoc cua mang: " + testQueue.size());
        System.out.println("Đa xoa: "+testQueue.min().getValue() + "-" + testQueue.removeMin().getKey());
        System.out.println("Kich thuoc cua mang: " + testQueue.size());
        System.out.println("Phan tu nho nhat: " + testQueue.min().getValue() + "-" + testQueue.min().getKey());
        System.out.println(testQueue.min().getValue() + "-" + testQueue.removeMin().getKey());
        for (int i = 0; i < testQueue.size(); i++) {
            System.out.print(testQueue.array[i].getValue() + " ");
        }
    }

    public void testSortArray(){
        SortedArrayPriorityQueue testQueue = new SortedArrayPriorityQueue();
        testQueue.insert(3, 3);
        testQueue.insert(2, 2);
        testQueue.insert(1, 1);
        testQueue.insert(4, 4);
        testQueue.insert(0, 0);
        testQueue.insert(5, 5);

        System.out.println("Array: ");
        for (int i = 0; i < testQueue.size(); i++) {
            System.out.print(testQueue.array[i].getValue() + " ");
        }
        System.out.println("\nKich thuoc cua mang: " + testQueue.size());
        System.out.println("Đa xoa: "+testQueue.min().getValue() + "-" + testQueue.removeMin().getKey());
        System.out.println("Kich thuoc cua mang: " + testQueue.size());
        System.out.println("Phan tu nho nhat: " + testQueue.min().getValue() + "-" + testQueue.min().getKey());
        System.out.println(testQueue.min().getValue() + "-" + testQueue.removeMin().getKey());
        for (int i = 0; i < testQueue.size(); i++) {
            System.out.print(testQueue.array[i].getValue() + " ");
        }
    }

    public void testUnsortedLinked(){
        UnsortedLinkedPQ testQueue = new UnsortedLinkedPQ();
        testQueue.insert(3, 3);
        testQueue.insert(2, 2);
        testQueue.insert(1, 1);
        testQueue.insert(4, 4);
        testQueue.insert(0, 0);
        testQueue.insert(5, 5);

        System.out.println("LinkedList trống: " + testQueue.isEmpty());
        System.out.println("Kich thuoc LinkedList: " + testQueue.size());
        System.out.println("Phan tu nho nhat: " + testQueue.min().getValue());
        System.out.println("Da xoa: " + testQueue.removeMin().getValue());
        System.out.println("Phan tu nho nhat: " + testQueue.min().getValue());
    }

    public void testSortedLinked(){
        SortedLinkedPQ testQueue = new SortedLinkedPQ();
        testQueue.insert(3, 3);
        testQueue.insert(2, 2);
        testQueue.insert(1, 1);
        testQueue.insert(4, 4);
        testQueue.insert(0, 0);
        testQueue.insert(5, 5);

        System.out.println("LinkedList trống: " + testQueue.isEmpty());
        System.out.println("Kich thuoc LinkedList: " + testQueue.size());
        System.out.println("Phan tu nho nhat: " + testQueue.min().getValue());
        System.out.println("Da xoa: " + testQueue.removeMin().getValue());
        System.out.println("Phan tu nho nhat: " + testQueue.min().getValue());
    }
}
