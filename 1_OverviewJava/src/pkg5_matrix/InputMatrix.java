/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_matrix;

import java.util.Scanner;

/**
 *
 * @author TU
 */
public class InputMatrix {

    public int m, n;
    public Double[][] matrix;
    public Double a;

    public void inputMatrix(Scanner sc) {
        System.out.println("So hang: ");
        m = sc.nextInt();
        System.out.println("So cot: ");
        n = sc.nextInt();
        matrix = new Double[m][n];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.println("Hang " + row + "cot" + col);
                matrix[row][col] = sc.nextDouble();
            }

        }
    }
}
