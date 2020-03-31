package ntu.edu.speciallinerlist.stack.linkedstack;

/**
 * 栈的链式存储
 * @author harley
 * date 2020/03/25 - 30
 */
public class LinkedStack {
    private Element base;  // 栈底指针
    private Element top;   // 栈顶指针

    public void init() {
        Element element = new Element(); //开辟一个元素空间作为栈底
        base = element;
        top = element;
    }

    // 入栈
    public void push(int data) {
        Element element = new Element();
        element.data = data;
        element.next = top;
        top = element;
    }

    // 出栈
    public void pop() {
        if (isEmpty()) {
            System.out.println("退栈失败，栈为空！");
        }
        int data = top.data;
        top = top.next;
        System.out.println(data);
    }

    // 判断是否为空
    public boolean isEmpty() {
        if (base == top) {
            return true;
        } else {
            return false;
        }
    }

    // 清空栈
    public void clear() {
        while (!isEmpty()) {
            pop();
        }
        System.out.println("栈已清空！");
    }

    // 获取栈顶元素
    public Element getTop() {
        return top;
    }

    // 遍历栈
    public void print() {
        if (isEmpty()) {
            System.out.println("栈为空！");
        } else {
            Element flag = top;
            System.out.println("栈中元素为：");
            while (flag != base) {
                System.out.print(flag.data + " ");
                flag = flag.next;
            }
        }
    }
}
