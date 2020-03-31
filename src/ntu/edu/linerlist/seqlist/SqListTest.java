package ntu.edu.linerlist.seqlist;

/**
 * 测试方法
 */

public class SqListTest {
    public static void main(String[] args) throws Exception {
        SqList list = new SqList(4);
        list.add(1);
        list.add(3);
        list.add(4);
        list.showList();
        list.insert(1, 2);
        System.out.println("插入数据后：");
        list.showList();
        list.delete(1, 2);
        System.out.println("删除数据后：");
        list.showList();
        list.findByData(3);
        list.findByData(2 );
    }
}
