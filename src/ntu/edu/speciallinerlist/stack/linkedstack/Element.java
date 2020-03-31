package ntu.edu.speciallinerlist.stack.linkedstack;

/**
 * 链栈的结点
 * @author harley
 * 2020/03/25
 */
public class Element {
    public int no;
    public int data;
    public Element next;

    public Element() {
    }

    public Element(int no, int data) {
        this.no = no;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Element{" +
                "no=" + no +
                ", data=" + data +
                ", next=" + next +
                '}';
    }
}
