package pk1_beginADT;

import org.w3c.dom.Node;

public class SimpleLinkedList<T> {
    class Node{
        T data; // giá trị của nút
        Node next; // liên kết đến nút tiếp theo

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top = null;
    private Node bot = null;
    private int n = 0;

    // Thêm phần tử vào đầu danh sách
    public void add(T data){
        Node newNode = new Node(data);
        if (top == null){top = bot = newNode;}
        else {
            newNode.next = top;
            top = newNode;
        }
        n++;
    }
    public void addBot(T data){
        Node newNode = new Node(data);
        if(bot == null){top = bot = newNode;}
        else {
            newNode.next = bot;
            bot = newNode;
        }
        n++;
    }
    public T get(int idx){
        Node current = top;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
        return current.data;
    }
    public void set(int idx, T data){
        Node current = top;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
        current.data = data;
    }
    public boolean isContain(T data) {
        Node current = top;
        while (current.next != null){
            if(current.data.equals(data)){return true;}
        }
        return false;
    }
    public int size() {
        if(!isEmpty()){return n;}
        return 0;
    }
    public boolean isEmpty() {
        if(n != 0){return false;}
        return true;
    }
    public T removeTop() {
        if(top != null){
            top = top.next;
            n--;
        }
        return null;
    }
    public T removeBot() {
        if(bot != null){
            if(top == bot){top = bot = null;}
            else {
                Node current = top;
                while (current.next != bot){
                    current = current.next;
                }
                current.next = null;
                bot = current;
            }
            n--;
        }
        return null;
    }
    public void remove(T data) {
    // Xóa tất cả các phần tử có giá trị bằng data
        if (top.data == data) {
            top = top.next;
            n--;
            return;
        }

        Node current = top;
        while (current != null && current.next != null){
            if(current.data.equals(data)){
                current.next = (current.next).next;
                n--;
            }else {current = current.next;}
        }
        return;
    }

}
