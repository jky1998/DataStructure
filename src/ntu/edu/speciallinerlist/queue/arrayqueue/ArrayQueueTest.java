package ntu.edu.speciallinerlist.queue.arrayqueue;

import ntu.edu.speciallinerlist.queue.circlearrayqueue.CircleArrayQueue;

import java.util.Scanner;

/**
 * 数组模拟队列
 * @author Harley J
 * @date 2019/8/26
 */

public class ArrayQueueTest {

    public static void main(String[] args) {
        //ArrayQueue arrQueue = new ArrayQueue(3);
        CircleArrayQueue caq = new CircleArrayQueue(5);
        char key = ' ';       // 接收用户输入
        Scanner sc = new Scanner(System.in);
        boolean loop = true;   // 默认死循环

        while (loop) {
            System.out.println("s(show): 显示数据");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据");
            System.out.println("g(get): 从队列中取出数据");
            System.out.println("h(head): 查看队列头的数据");

            int data;
            key = sc.next().charAt(0);
            switch (key) {
                case 's' :
                    caq.showQueue();
                    break;
                case 'a' :
                    System.out.println("请输入需要添加的数据：");
                    data = Integer.parseInt(sc.next());
                    caq.addQueue(data);
                    break;
                case 'g' :
                    try {
                        data = caq.getQueue();
                        System.out.println("取到的数据为：" + data);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h' :
                    try {
                        data = caq.headQueue();
                        System.out.println("队首数据为：" + data);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e' :
                    sc.close();
                    loop = false;
                    break;
                default:
                    System.out.println("请正确的输入！");
                    break;
            }
        }
    }

}
