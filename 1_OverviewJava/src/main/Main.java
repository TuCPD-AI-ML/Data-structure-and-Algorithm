package main;

import java.util.Scanner;
import pkg1_array_operation.Array;
import pkg1_array_operation.Find;
import pkg1_array_operation.SortArray;
import pkg2_complex.Complex_Operation;
import pkg3_sphere.Caculation;
import pkg3_sphere.InputPosition;
import pkg3_sphere.TwoSphere;

/**
 *
 * @author TU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Bai1();
//        Bai2();
//        Bai3();
        Bai4();
    }

    static void Bai1() {
        // thao tác với mảng
        Array arr = new Array();
        arr.Input();
        arr.Output();
        //arr.Lists();

        // sắp xếp mảng
        System.out.println(arr.size);
        SortArray s = new SortArray();
        s.Sort(arr.size, arr.array);

        // Tìm kiếm phần tử
        Find f = new Find();
        f.Search(arr.size, arr.array);
    }

    static void Bai2() {
        Scanner sc = new Scanner(System.in);
        Complex_Operation complex1 = new Complex_Operation();
        Complex_Operation complex2 = new Complex_Operation();
        Complex_Operation complexAdd;
        Complex_Operation complexMulti;

        // Nhập số thực
        System.out.println("Nhap vao so phuc 1:");
        complex1.Input(sc);
        System.out.println("Nhap vao so phuc 2:");
        complex2.Input(sc);

        //Hiển thị số thực
        System.out.println("So phuc 1 la:");
        complex1.Display();
        System.out.println("So phuc 2 la:");
        complex2.Display();

        // Cộng hai số thực
        complexAdd = complex1.Add(complex2);
        System.out.println("Ket qua cua phep cong la:");
        complexAdd.Display();

        // Nhân hai số thực
        complexMulti = complex1.Multi(complex2);
        System.out.println("Ket qua cua phep nhan la:");
        complexMulti.Display();
    }

    static void Bai3() {
        Scanner sc = new Scanner(System.in);
        InputPosition sphere1 = new InputPosition();
        sphere1.InputSphere(sc);
        //System.out.println(position.SizeSphere());

        Caculation sphere = new Caculation();
        Double Sxq = sphere.SizeSphere(sphere1.r);
        System.out.println(Sxq);
        Double V = sphere.Volume(sphere1.r);
        System.out.println(V);

        InputPosition sphere2 = new InputPosition();
        sphere2.InputSphere(sc);
        TwoSphere sphereCover;

    }
    
    static void Bai4() {
        
    }
}
