package ntu.edu.speciallinerlist.queue.circlearrayqueue;

/**
 * 代码优化
 * 环形队列 替代 普通队列
 */
public class CircleArrayQueue {

    public int maxSize;
    public int front;
    public int rear;
    public int[] arr;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 1;   // 指向队首的元素
        rear = 1;    // 指向最后一个元素的后一个位置
    }

    // 判断队列是否满
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    // 判断队列是否空
    public boolean isEmpty() {
        return rear == front;
    }

    // 添加数据到队列
    public void addQueue(int data) {
        if (isFull()) {
            System.out.println("队列已满！");
            return;
        }
        arr[rear] = data;
        // 将rear后移，必须考虑取模
        rear = (rear + 1) % maxSize;
    }

    // 获取队列的数据， 出队列
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法取数据！");
        }
        int data = arr[front];
        front = (front + 1) % maxSize;
        return data;
    }

    // 显示队列的所有数据
    public void showQueue() {
        // 从 front 开始 到 有效数据个数 结束
        System.out.println("队列中数据为：");
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d] = %d ", i % maxSize, arr[i % maxSize]);
        }
        System.out.println();
    }

    // 求出当前队列的有效数据个数
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    // 显示队列的头元素
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return arr[front];
    }

}
