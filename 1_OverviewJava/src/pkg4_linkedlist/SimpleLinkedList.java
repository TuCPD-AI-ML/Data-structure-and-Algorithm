/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_linkedlist;

/**
 *
 * @author TU
 */
public class SimpleLinkedList<T> {

    private Node<T> top;
    private Node<T> bot;
    private int n = 0;

    public SimpleLinkedList() {
        this.top = null;
        this.bot = null;
    }

    public void addTop(T data) {
// Thêm phần tử vào đầu danh sách
        Node<T> newNode = new Node<>(data);
        newNode.setNext(this.top);
        this.top = newNode;
    }

    public void addBot(T data) {
// Thêm phần tử vào cuối danh sách
        // Neu linkedlist trong thi doi tuong newNode se thanh dau cua linkedlist
        Node<T> newNode = new Node<>(data);
        if (this.top == null) {
            this.top = newNode;
            return;
        }

        // tro toi cuoi linkedlist
        Node<T> last = this.top;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        // Them phan tu vao cuoi linkedlist
        last.getNext();

    }

    public T get(int i) {
// Lấy phần tử ở vị trí thứ i
        Node node = this.top;
        for (int pos = 0; pos < i; pos++) {
            node = node.getNext();
        }
        return null;
    }

    public void set(int i, T data) {
// Gán giá trị ở vị trí i bằng data(chua xong)
        Node node = this.top;
        for (int pos = 0; pos < i; pos++) {
            node = node.getNext();
        }
        //       node.getData() = data;
    }

    public boolean isContain(T data) {
// Kiểm tra trong danh sách có chứa phần tử data hay không?
        int i = 0;
        Node<T> current = this.top;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
            i++;
        }
        return false;
    }

    public int size() {
// Trả lại thông tin số phần tử có trong danh sách        
        int count = 0;
        Node<T> cur = this.top;
        while (cur != null) {
            count += 1;
            cur = cur.getNext();
        }

        return 0;
    }

    public boolean isEmpty() {
// Kiểm tra danh sách có rỗng hay không?
        Node node = this.top;
        if (node != null) {
            System.out.println("Linked list co phan tu");
            return false;
        } else {
            System.out.println("Linked list rong");
            return true;
        }

    }

    public T removeTop() {

// Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó
        this.top = this.top.getNext();
        return null;
    }

    public T removeBot() {

// Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó
        Node preLast = this.top;
        while (preLast.getNext().getNext() != null) {
            preLast = preLast.getNext();
        }
        preLast.setNext(null);
        return null;
    }

    public void remove(T data) {
// Xóa tất cả các phần tử có giá trị bằng data
        
    }
}
