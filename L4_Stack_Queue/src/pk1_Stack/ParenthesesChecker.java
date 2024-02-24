package pk1_Stack;

public class ParenthesesChecker extends ArrayStack{
    public boolean checkParentheses(String expressions){
        char current, charTemp;
        int j = 0, flag = 0;
//        char[] stack = new char[20];
        ArrayStack<Character> stack = new ArrayStack<Character>(20);
        System.out.println(stack.size());
        for (int i = 0; i < expressions.length(); i++) {
            current = expressions.charAt(i);
            if(current=='(' || current=='[' || current=='{'){
//                stack[j] = current;
                stack.push(current);
//                j++;
                flag = 1;
            } else if (current ==')') {
//                if(flag==1) {
//                    j--;
//                }
//                charTemp = stack[j];
                    charTemp = stack.top();
                    if(stack.isEmpty() || charTemp != '('){
                        System.out.println("No match");
                        return false;
                    }
                } else if (current == ']') {
//                    if(flag==1) {
//                        j--;
//                    }
//                    charTemp = stack[j];
                    charTemp = stack.top();
                    if(stack.isEmpty() || charTemp != '('){
                        System.out.println("No match");
                        return false;
                    }
                } else if (current == '}') {
//                    if(flag==1) {
//                        j--;
//                    }
//                    charTemp = stack[j];
                    charTemp = stack.top();
                    if(stack.isEmpty() || charTemp != '('){
                        System.out.println("No match");
                        return false;
                    }
                }
            }
        System.out.println("Match");
        return true;
    }
}
