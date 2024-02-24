/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_sphere;

/**
 *
 * @author TU
 */
public class Caculation extends InputPosition {
    
    public Double SizeSphere(Double radius) {
        System.out.println("Dien tich xung quanh hinh cau: ");
        return 4 * pi * radius * radius;
    }

    public double Volume(Double radius) {
        System.out.println("The tich cua hinh cau: ");
        return (4 / 3) * pi * Math.pow(radius, 3);
    }
}
