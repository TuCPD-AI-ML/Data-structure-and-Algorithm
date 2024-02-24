/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_sphere;

import java.util.Scanner;

/**
 *
 * @author TU
 */
public class InputPosition {

    public Double r, x, y, z;
    Double pi = Math.PI;

    public InputPosition() {
    }

    public InputPosition(Double r, Double x, Double y, Double z) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public void InputSphere(Scanner sc) {
        System.out.println("Ban kinh hinh cau: ");
        r = sc.nextDouble();
        System.out.println("Toa do");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        
        System.out.println("Vi tri hinh cau: \n" + "(r, x, y, z) = " + r +", " + x +", " + y +", " + z);
    }

}
