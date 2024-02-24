/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2_complex;

import java.util.Scanner;

/**
 *
 * @author TU
 */
public class Complex_Operation {

    public Double real;
    public Double imaginary;

    public Complex_Operation() {
    }

    public Complex_Operation(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void Input(Scanner sc) {
        System.out.println("\tNhap vao phan thuc: ");
        real = sc.nextDouble();
        System.out.println("\tNhap vao phan ao: ");
        imaginary = sc.nextDouble();
    }

    public void Display() {
        if (imaginary < 0) {
            System.out.println(real + " - " + Math.abs(imaginary) + "*i");
        } else {
            System.out.println(real + " + " + imaginary + "*i");
        }
    }

    public Complex_Operation Add(Complex_Operation complex2) {
        Double realAdd = real + complex2.real;
        Double imaginaryAdd = imaginary + complex2.imaginary;
        return new Complex_Operation(realAdd, imaginaryAdd);
    }

    public Complex_Operation Multi(Complex_Operation complex2) {
        Double realAdd = real * complex2.real - imaginary * complex2.imaginary;
        Double imaginaryAdd = real * complex2.imaginary + imaginary * complex2.real;
        return new Complex_Operation(realAdd, imaginaryAdd);
    }

    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public Double getImaginary() {
        return imaginary;
    }

    public void setImaginary(Double imaginary) {
        this.imaginary = imaginary;
    }

}
