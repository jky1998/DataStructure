package ntu.edu.speciallinerlist.stack.sequentialstack;

import java.util.Scanner;

/**
 *  用数组模拟顺序栈的实现
 *  @author  Harley J
 *  @date 2019/11/10
 */
public class SequentialStackDemo {
    public static void main(String[] args) {
        SequentialStack sequentialStack = new SequentialStack(4);
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        String key = "";

        while (loop) {
            System.out.println("show: 显示栈");
            System.out.println("exit: 退出栈");
            System.out.println("push: 入栈");
            System.out.println("pop: 出栈");
            System.out.println("请输入你的选择");
            key = sc.next();
            switch (key) {
                case "show":
                    sequentialStack.list();
                    break;
                case "exit":
                    sc.close();
                    loop = false;
                    break;
                case "push":
                    System.out.println("请输入一个数据：");
                    int val = Integer.parseInt(sc.next());
                    sequentialStack.push(val);
                    break;
                case "pop":
                    try {
                        int res = sequentialStack.pop();
                        System.out.println("取出的数据为：" + res);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                default:
                    break;
            }
        }
        System.out.println("程序退出~~~");
    }
}
