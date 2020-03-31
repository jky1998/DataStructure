package ntu.edu.linerlist.linkedlist;

import static ntu.edu.linerlist.linkedlist.SingleLinkedList.*;

/**
 * 通过单向链表实现水浒英雄的排序
 * @author Harley J
 * @date 2019/9/1
 */

public class SingleLinkedListDemo {

    public static void main(String[] args) {
        // 先创建几个节点
        HeroNode hero1 = new HeroNode(1,"宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2,"卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3,"吴用", "智多星");
        HeroNode hero4 = new HeroNode(4,"林冲", "豹子头");

        // 创建一个链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.add(hero4);
//        singleLinkedList.add(hero2);
//        singleLinkedList.add(hero3);
        singleLinkedList.add(hero1);
        singleLinkedList.addOrder(hero4);
        singleLinkedList.addOrder(hero1);
        singleLinkedList.addOrder(hero3);
        singleLinkedList.addOrder(hero2);
        singleLinkedList.list();

        HeroNode hero = new HeroNode(1,"姐", "jjjj");
        singleLinkedList.update(hero);
        singleLinkedList.delete(1);
        singleLinkedList.delete(4);
        singleLinkedList.list();

        HeroNode head = singleLinkedList.getHead();
        System.out.println("单链表长度为：" + getLength(head));
        System.out.println("倒数第1个为：" + findLastNode(head, 1));

        //reverseList(head);
        singleLinkedList.list();

        // 测试逆序打印单链表 （链表本身的结构没有变化）
        System.out.println("逆序打印");
        revesePrint(head);

    }

}
