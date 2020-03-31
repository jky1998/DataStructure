package ntu.edu.linerlist.linkedlist;

/**
 * 先定义一个HeroNode 每个HeroNode对象就对应一个英雄节点
 */

public class HeroNode {

    public int no;
    public String name;
    public String nickName;
    public HeroNode next;  // 指向下一个节点

    public HeroNode() {}

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                //", next=" + next +   会重复打印
                '}';
    }
}
