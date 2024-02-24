/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_sphere;

/**
 *
 * @author TU
 */
public class TwoSphere extends InputPosition {

    public TwoSphere() {
    }

    public InputPosition Cover(InputPosition sphere2) {
        // Khoang cach hai tam 
        Double distance = Math.sqrt(Math.pow(x - sphere2.x, 2) + Math.pow(y - sphere2.y, 2) + Math.pow(z - sphere2.z, 2));
        if (distance + r <= sphere2.r) {
            System.out.println("Hai hinh cau bao nhau");
        } else {
            System.out.println("Hai hinh khong bao nhau");
        }
        return null;
    }
}
