package ntu.edu.speciallinerlist.queue.arrayqueue;

public class ArrayQueue {

    // MaxSize 数组的最大容量
    // front 队列头
    // rear 队列尾
    public int maxSize;
    public int front;
    public int rear;
    public int[] arr;

    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;  // 指向队列头部，并不包含  即指向队列的前一个位置
        rear = -1;   // 指向队列尾部，即就是队列最后一个数据
    }

    // 判断队列是否满
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return front == rear;
    }

    // 添加数据到队列
    public void addQueue(int data) {
        // 首先判断队列是否满
        if (isFull()) {
            System.out.println("队列满，不能加入数据！");
            return;   // 跳出该方法
        }
        rear++;
        arr[rear] = data;
        System.out.println("添加成功！");
    }

    // 获取队列的数据，出队列
    public int getQueue() {
        if (isEmpty()) {
            // 通过抛出异常来处理
            throw new RuntimeException("队列为空");
        }
        front++;
        int data = arr[front];
        return data;
    }

    // 显示队列的所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空！");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d", i, arr[i]);
            System.out.println();
        }
    }

    // 显示队列的头数据 注意不是取数据
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return arr[front + 1];
    }

}