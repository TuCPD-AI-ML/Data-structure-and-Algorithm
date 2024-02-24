/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import pk1_beginADT.FractionNumber;

import java.util.Scanner;

/**
 *
 * @author TU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bai1();
    }

    static void bai1() {
        Scanner sc = new Scanner(System.in);
        FractionNumber fraction = new FractionNumber();
        FractionNumber[] fractionArr = fraction.printRowFraction(sc, 3);
        fraction.totalFraction(fractionArr);

        FractionNumber fraction1 = new FractionNumber(3, 4);
        FractionNumber fraction2 = new FractionNumber(6, 7);

        System.out.println("\nTong hai phan so: ");
        System.out.println(fraction1.toString() + " + " + fraction2.toString() + " = "
                + (fraction1.addFraction(fraction2)).toString());

        System.out.println("Hieu hai phan so: ");
        System.out.println(fraction1.toString() + " - " + fraction2.toString() + " = "
                + (fraction1.minus(fraction2)).toString());

        System.out.println("Tich hai phan so: ");
        System.out.println(fraction1.toString() + " * " + fraction2.toString() + " = "
                + (fraction1.mutil(fraction2)).toString());

        System.out.println("Thuong hai phan so: ");
        System.out.println(fraction1.toString() + " : " + fraction2.toString() + " = "
                + (fraction1.divi(fraction2)).toString());

    }

}
