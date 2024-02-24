import pk1_Stack.LinkedListStack;
import pk1_Stack.ParenthesesChecker;

public class Main {
    public static void main(String[] args) {
//        bai1(5); // Bài 1.1 + Bài 1.2
        bai3();
    }

    static void bai1(int n){
        LinkedListStack stack = new LinkedListStack();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        System.out.println(stack.isEmpty());
        System.out.println(stack.top());
    }

    static void bai3(){
        String parentheses1 = "(a + b) * (c – d)";
        String parentheses2 = "()}";
        ParenthesesChecker checker = new ParenthesesChecker();
        checker.checkParentheses(parentheses1);
        checker.checkParentheses(parentheses2);
    }

}