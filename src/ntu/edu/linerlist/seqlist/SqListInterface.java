package ntu.edu.linerlist.seqlist;

/**
 * 操作顺序表的接口方法
 * @author harley
 * date 2020/03/17 - 19
 */

public interface SqListInterface {

    void initList(int size);    // 初始化顺序表
    void add(int data) throws Exception;         // 添加数据
    void insert(int i, int data) throws Exception;   // 在指定位置插入数据
    void delete(int i, int data) throws Exception;   // 删除指定位置的数据
    void findByData(int data) throws Exception;          // 按值查找
    void showList();       // 打印顺序表

}
