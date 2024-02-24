
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import pk1_Simple_Sort.Array;
import pk1_Simple_Sort.Card.Card;
import pk1_Simple_Sort.Card.CompareCard;
import pk1_Simple_Sort.Card.Deck;
import pk1_Simple_Sort.SimpleSort;
import pk1_Simple_Sort.SortTObj;
import pk2_applicate_sort.CountElementLarger;
import pk2_applicate_sort.FindIntInPosK;
import pk2_applicate_sort.FindIntegerMin;
import pk2_applicate_sort.FindMissingNumbers;
import pk2_applicate_sort.MergeSort;
import pk2_applicate_sort.MergeSortReverse;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Array arr = new Array();
//        arr.input();
//        System.out.println("Mang chua duoc sap xep: ");
//        arr.output();

        int[] arr1 = random();
//        int[] arr2 = random();
//        int[] arr3 = random();

//        bai1(arr1.length, arr1);
//        bai2(arr2.length, arr2);
//        bai3(arr3.length, arr3);
//        bai5();
//        bai6(); // + bài 7
//        bai8(arr3.length, arr3);
//        bai9(arr1);
//        bai10(arr1);
//        bai11();
        int[] arr = {1, 3, 5, 7, 9, 10};
        bai12(arr);

    }

    static int[] random() {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }
        return arr;
    }

    public static void bai1(int size, int[] array) {
        System.out.println("\nMang sau khi sap xep noi bot:");
        SimpleSort bubbleSort = new SimpleSort();
        bubbleSort.bubbleSort(size, array);
    }

    public static void bai2(int size, int[] array) {
        System.out.println("\nMang sau khi sap xep chon: ");
        SimpleSort select = new SimpleSort();
        select.selectSort(size, array);
    }

    public static void bai3(int size, int[] array) {
        System.out.println("\nMang sau khi sap xep chen: ");
        SimpleSort insert = new SimpleSort();
        insert.insertSort(size, array);
    }

    static void bai5() {
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }

        SortTObj<Integer> sort = new SortTObj();

        System.out.println("\n Bubble sort: ");
        sort.bubleSortAscending(arr);

        System.out.println("\n Selection sort: ");
        sort.selectSort(arr);

        System.out.println("\n Insertion sort: ");
        sort.insertSort(arr);
    }

    static void bai6() {
        Deck deck = new Deck();
        Card[] cards = deck.getCards();
        System.out.println("Before sorting:");
        for (Card card : cards) {
            System.out.println(card.getRank() + " " + card.getSuit());
        }
        Arrays.sort(cards, new CompareCard());
//        //Bubble sort
//        for (int i = 0; i < cards.length - 1; i++) {
//            for (int j = 0; j < cards.length - i - 1; j++) {
//                if (cards[j].compareTo(cards[j + 1]) > 0) {
//                    Card temp = cards[j];
//                    cards[j] = cards[j + 1];
//                    cards[j + 1] = temp;
//                }
//            }
//        }

        System.out.println("After sorting:");
        for (Card card : cards) {
            System.out.println(card.getRank() + " " + card.getSuit());
        }
    }

    static void bai8(int size, int[] arr) {
        System.out.println("\nSo nguyen nho nhat khong xuat hien trong day la: ");
        FindIntegerMin finMin = new FindIntegerMin();
        finMin.findIntMin(size, arr);
    }

    static void bai9(int[] arr) {
        FindMissingNumbers findMiss = new FindMissingNumbers();
        List<Integer> result = findMiss.findMissingNumbers(arr, 1, 100);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    static void bai10(int[] arr) {
        MergeSort merge = new MergeSort();
        MergeSortReverse mergeReverse = new MergeSortReverse();

        mergeReverse.mergeSortReverse(arr, 0, arr.length - 1);
        merge.mergeSort(arr, 0, arr.length - 1);
    }

    static void bai11() {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 60; i++) {
            arr.add(i);
        }

        Collections.shuffle(arr);
        CountElementLarger count = new CountElementLarger();
        count.countElementLarger(arr);
    }

    static void bai12(int arr[]) {
        FindIntInPosK findK = new FindIntInPosK();
        System.out.println(Arrays.toString(arr));
        findK.finIntegerKPosision(arr, 1, 10, 4);
    }

}
