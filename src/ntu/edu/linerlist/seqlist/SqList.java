package ntu.edu.linerlist.seqlist;

/**
 * 线性表的顺序存储
 * @author harley
 * date 2020/03/17 - 19
 */

public class SqList implements SqListInterface {

    int defaultSize = 10;    // 默认容量
    int size = 0;            // 数组元素个数
    int[] sqList = null;

    // 默认容量构造器
    public SqList() {
        initList(defaultSize);
    }

    // 指定容量构造器
    public SqList(int listSize) {
        this.defaultSize = listSize;
        initList(defaultSize);
    }


    /**
     * 初始化顺序表
     * @param maxSize
     * date 2020/03/17
     */
    @Override
    public void initList(int maxSize) {
        sqList = new int[maxSize];
    }

    /**
     * 顺序添加数据
     * @param data
     * date 2020/03/18
     */
    @Override
    public void add(int data) throws Exception {
        if (size == defaultSize) {
            throw new Exception("顺序表已满" + size);
        }

        sqList[size] = data;
        size++;
    }

    /**
     * 插入指定数据
     * @param i
     * @param data
     * @throws Exception\
     * date 2020/03/18
     */
    @Override
    public void insert(int i, int data) throws Exception {
        // 判断是否溢出
        // 这里的defaultSize为构造的顺序表的长度
        if (size == defaultSize) {
            throw new Exception("顺序表已满，无法插入！");
        }

        // 判断插入位置的合法性
        // 插入按数组的方式，从0开始计算
        if (i < 0 || i >= size) {
            throw new Exception("插入位置异常！");
        }

        // 将i后面的元素依次后移
        for (int j = size - 1; j >= i; j--) {
            sqList[j + 1] = sqList[j];
        }
        // 插入数据
        sqList[i] = data;
    }

    /**
     * 删除指定数据
     * @param i
     * @param data
     * @throws Exception
     * date 2020/03/19
     */
    @Override
    public void delete(int i, int data) throws Exception {
        // 判断顺序表是否为空
        if (size == 0) {
            throw new Exception("顺序表为空");
        }

        // 将i后面的数据依次前移
        for (int j = i; j < size; j++) {
            sqList[j] = sqList[j + 1];
        }

        // 表长减一
        sqList[size] = 0;
        size = size--;
    }

    @Override
    public void findByData(int data) {
        for (int i = 0; i < size; i++) {
            if (sqList[i] == data) {
                System.out.println("值为" + data + "的数据在表的第" + (i + 1) + "位");
                break;
            } else if (i == (size - 1) && sqList[size - 1] != data) {
                System.out.println("没有找到");
            }
        }
    }

    @Override
    public void showList() {
        for (int i = 0; i < sqList.length; i++) {
            System.out.println(sqList[i]);
        }
    }


}
