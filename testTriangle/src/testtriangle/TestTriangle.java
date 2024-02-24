/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testtriangle;

/**
 *
 * @author TU
 */
public class TestTriangle {

    static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("1");
            return true;
        } else if (a == b || b == c || c == a) {
            System.out.println("1");
            return true;
        } else if (a == b && b == c && c == a) {
            System.out.println("1");
            return true;
        } else {
            System.out.println("0");
            return false;
        }
        // begin edit 

        //end edit
    }

    static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        // begin edit 
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println(a*a);
        System.out.println(b*b);
        System.out.println(c*c);

        int a_bp = (int) (a * a);
        int b_bp = (int) (b * b);
        int c_bp = (int) (c * c);
        
        System.out.println(a_bp);
        System.out.println(b_bp);
        System.out.println(c_bp);
        if ((a_bp == (b_bp + c_bp)) || (b_bp == (a_bp+c_bp)) || (c_bp == (b_bp+a_bp))){
            System.out.println("1");
            return true;
        } // else if (((a * a + b * b == c * c) && (a == b)) ||
        //             ((a * a + c * c == b * b) && (a == c)) ||
        //             ((b * b + c * c == a * a) && (b == c)))
        //  {
        // 	 return true;
        // }           
        else {
            System.out.println("0");
            return false;
        }
        //end edit     
    }

    public static void main(String[] args) {
        TestTriangle check = new TestTriangle();
        check.isTriangle(5, 10, 10, 10, 10, 20);
        check.isRightTriangle(5, 10, 10, 10, 10, 20);
//        System.out.println(check.isRightTriangle(5, 10, 10, 10, 10, 20));
    }

}
