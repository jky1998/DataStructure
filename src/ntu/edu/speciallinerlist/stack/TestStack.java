package ntu.edu.speciallinerlist.stack;


import java.util.Stack;

// 演示栈的基本使用
public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // 入栈
        stack.add("smith");
        stack.add("tom");
        stack.add("jack");  // 也可以用push

        // 出栈
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
        // jack tom smith
    }
}
