/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk1_beginADT;

import java.util.Scanner;

/**
 *
 * @author TU
 */
public class FractionNumber {

    private float numerator;
    private float denominator;

    public FractionNumber() {
    }

    public FractionNumber(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public FractionNumber addFraction(FractionNumber c) {
        float numeratorAdd = this.getNumerator() * c.getDenominator() + c.getNumerator() * this.getDenominator();
        float denominatorAdd = this.getDenominator() * c.getDenominator();
        c = new FractionNumber(numeratorAdd, denominatorAdd);
        c.normalize();
        return c;
    }

    public FractionNumber minus(FractionNumber c) {
        float numeratorAdd = this.getNumerator() * c.getDenominator() - c.getNumerator() * this.getDenominator();
        float denominatorAdd = this.getDenominator() * c.getDenominator();
        c = new FractionNumber(numeratorAdd, denominatorAdd);
        c.normalize();
        return c;
    }

    public FractionNumber mutil(FractionNumber c) {
        float numeratorAdd = this.getNumerator() * c.getNumerator();
        float denominatorAdd = this.getDenominator() * c.getDenominator();
        c = new FractionNumber(numeratorAdd, denominatorAdd);
        c.normalize();
        return c;
    }

    public FractionNumber divi(FractionNumber c) {
        float numeratorAdd = this.getNumerator() * c.getDenominator();
        float denominatorAdd = this.getDenominator() * c.getNumerator();
        c = new FractionNumber(numeratorAdd, denominatorAdd);
        c.normalize();
        return c;
    }

    public void normalize() {
        float UCLN = findUCLN(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / UCLN);
        this.setDenominator(this.getDenominator() / UCLN);
    }

    public float findUCLN(float a, float b) {
        if (b == 0) {
            return a;
        }
        return findUCLN(b, a % b);
    }

    public FractionNumber[] printRowFraction(Scanner sc, int n){
        sc = new Scanner(System.in);
        FractionNumber[] fraction = new FractionNumber[n];
        for (int i = 0; i <n; i++) {
            System.out.printf("Nhap vao phan so thu %d: ", i+1);
            numerator = sc.nextFloat();
            denominator = sc.nextFloat();
            fraction[i] = new FractionNumber(numerator, denominator);
        }

        System.out.println("Day phan so: ");
        for (FractionNumber fractionNumber : fraction ) {
            System.out.print(fractionNumber + " ");
        }
        return fraction;
    }
    public FractionNumber totalFraction(FractionNumber[] fraction){
        int n = fraction.length;
        FractionNumber sum = new FractionNumber(0, 1);
        for (int i = 0; i < n; i++) {
            sum= sum.addFraction(fraction[i]);
        }
        System.out.print("\nTong day phan so vua nhap: " + sum);
        return sum;
    }
    public float getValue(){
        return (float) numerator/denominator;
    }

    public float getNumerator() {
        return numerator;
    }

    public void setNumerator(float numerator) {
        this.numerator = numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    public void setDenominator(float denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
//        if (this.numerator * this.denominator < 0) {
//            System.out.print("-" + Math.abs(this.numerator) + "/" + Math.abs(this.denominator));
//        } else {
//            System.out.print(Math.abs(this.numerator) + "/" + Math.abs(this.denominator));
//        }
        return this.numerator + "/" + this.denominator;
    }

}
