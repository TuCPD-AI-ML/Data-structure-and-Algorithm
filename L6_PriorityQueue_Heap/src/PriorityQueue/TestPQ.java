package PriorityQueue;

public class TestPQ {
    public void testUnsortedArray(){
        UnsortedArrayPriorityQueue testQueue = new UnsortedArrayPriorityQueue();
        testQueue.insert(27, "Quýt");
        testQueue.insert(50, "Hồng");
        testQueue.insert(12, "Dưa hấu");
        testQueue.insert(45, "Roi");
        testQueue.insert(20, "Dừa");
        testQueue.insert(20, "Ổi");

        System.out.println("\nCac san pham: ");
        for (int i = 0; i < testQueue.size(); i++) {
            System.out.print(testQueue.array[i].getValue() + ", ");
        }
        System.out.println("\nSo hang hoa: " + testQueue.size());
        System.out.println("Da ban het: "+testQueue.min().getValue() + "-" + testQueue.removeMin().getKey() + "K/kg");
        System.out.println("So hang hoa con lai: " + testQueue.size());
        System.out.println("San pham gia thap nhat: " + testQueue.min().getValue() + "-" + testQueue.min().getKey() + "K/kg");
        System.out.println("Cac san pham con lai: ");
        for (int i = 0; i < testQueue.size(); i++) {
            System.out.println(testQueue.array[i].getValue() + "-" + testQueue.array[i].getKey() + "K/kg");
        }
    }

    public void testSortArray(){
        SortedArrayPriorityQueue testQueue = new SortedArrayPriorityQueue();
        testQueue.insert(27, "Quýt");
        testQueue.insert(50, "Hồng");
        testQueue.insert(12, "Dưa hấu");
        testQueue.insert(45, "Roi");
        testQueue.insert(20, "Dừa");
        testQueue.insert(20, "Ổi");

        System.out.println("\nCac san pham: ");
        for (int i = 0; i < testQueue.size(); i++) {
            System.out.print(testQueue.array[i].getValue() + ", ");
        }
        System.out.println("\nSo hang hoa: " + testQueue.size());
        System.out.println("Da ban het: "+testQueue.min().getValue() + "-" + testQueue.removeMin().getKey() + "K/kg");
        System.out.println("So hang hoa con lai: " + testQueue.size());
        System.out.println("San pham gia thap nhat: " + testQueue.min().getValue() + "-" + testQueue.min().getKey() + "K/kg");
        System.out.println("Cac san pham con lai: ");
        for (int i = 0; i < testQueue.size(); i++) {
            System.out.println(testQueue.array[i].getValue() + "-" + testQueue.array[i].getKey() + "K/kg");
        }
    }

    public void testUnsortedLinked(){
        UnsortedLinkedPQ testQueue = new UnsortedLinkedPQ();
        testQueue.insert(27, "Quýt");
        testQueue.insert(50, "Hồng");
        testQueue.insert(12, "Dưa hấu");
        testQueue.insert(45, "Roi");
        testQueue.insert(20, "Dừa");
        testQueue.insert(20, "Ổi");

        System.out.println("So hang hoa: " + testQueue.size());
        System.out.println("San pham gia thap nhat: " + testQueue.min().getValue() + "-" + testQueue.min().getKey() + "K/kg");
        System.out.println("Da ban het: " + testQueue.removeMin().getValue() + "-" + testQueue.min().getKey() + "K/kg");
        System.out.println("San pham gia thap nhat: " + testQueue.min().getValue() + "-" + testQueue.min().getKey() + "K/kg");
    }

    public void testSortedLinked(){
        SortedLinkedPQ testQueue = new SortedLinkedPQ();
        testQueue.insert(27, "Quýt");
        testQueue.insert(50, "Hồng");
        testQueue.insert(12, "Dưa hấu");
        testQueue.insert(45, "Roi");
        testQueue.insert(20, "Dừa");
        testQueue.insert(20, "Ổi");

        System.out.println("So hang hoa: " + testQueue.size());
        System.out.println("San pham gia thap nhat: " + testQueue.min().getValue() + "-" + testQueue.min().getKey() + "K/kg");
        System.out.println("Da ban het: " + testQueue.removeMin().getValue() + "-" + testQueue.min().getKey() + "K/kg");
        System.out.println("San pham gia thap nhat: " + testQueue.min().getValue() + "-" + testQueue.min().getKey() + "K/kg");
    }
}
