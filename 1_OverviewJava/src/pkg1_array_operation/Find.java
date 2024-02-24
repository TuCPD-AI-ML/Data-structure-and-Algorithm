/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_array_operation;

/**
 *
 * @author TU
 */
public class Find extends SortArray{
    public int k, x, y, z;

    public void Search(int size, Double[] array){
        System.out.println("\nNhap so can tim: ");
        k = scanner.nextInt();
        x = 0;
        y = size - 1;

        // duyệt vòng lặp while
        // nếu x còn nhỏ hơn hoặc bằng y thì còn tiếp tục thực hiện thân vòng lặp
        while (x <= y) {
            z = (x + y) / 2;

            // nếu phần tử tại vị trí j bằng số nguyên k cần tìm
            // thì thông báo tìm thấy số k tại vị trí j
            // và kết thúc vòng lặp
            if (array[z] == k) {
                System.out.println("Co phan tu " + k + " tai vi tri " + z);
                return; // kết thúc vòng lặp while và bỏ qua các lệnh bên dưới
            } else if (array[z] < k) {
                // nếu phần tử tại z nhỏ hơn số nguyên k
                // thì tăng x = z + 1
                // và quay lại thực hiện vòng lặp while
                x = z + 1;
            } else {
                // nếu phần tử tại z lớn hơn số nguyên k
                // thì giảm y = z - 1
                // và quay lại thực hiện vòng lặp while
                y = z - 1;
            }
        }

        // nếu sau khi thực hiện vòng lặp while
        // mà không tìm thấy số cần tìm
        // thì hiển thị thông báo không tìm thấy
        System.out.println("Trong mang khong co phan tu can tim.");
    }
}
