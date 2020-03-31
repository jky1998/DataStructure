package ntu.edu.speciallinerlist.stack.linkedstack;

public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.init();
        linkedStack.push(0);
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.pop();
        linkedStack.print();
    }
}
