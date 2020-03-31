package ntu.edu.linerlist.linkedlist;

import java.util.Stack;

/**
 * 创建一个单链表用于管理英雄
 */

public class SingleLinkedList {

    // 先初始化一个头节点，头节点不要动, 不存放具体的数据
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead() {
        return head;
    }

    // 添加节点到单项列表
    public void add(HeroNode hero) {
        // 当不考虑编号的顺序时
        // 首先找到链表的最后一个节点
        // 需要一个辅助节点，head节点不能动
        HeroNode temp = head;
        // 遍历链表，找到最后的节点
        while (true) {
            // 找到链表的最后
            if (temp.next == null) {
                break;
            }
            // 如果没有找到节点，temp后移
            temp = temp.next;
        }
        // 当退出while循环时，temp指向链表的最后
        // 把该节点的next域指向要添加的节点
        temp.next = hero;
    }

    // 第二种添加英雄的方式  根据排名将英雄插入到新的节点
    // 如果已经有这个排名，则添加失败
    public void addOrder(HeroNode hero) {
        // 因为头节点不能动，所以需要一个辅助节点temp
        // temp应该找的为添加位置的前一个节点
        HeroNode temp = head;
        // 标识添加英雄的编号是否存在，默认为false
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                // 要插入的位置就在最后
                break;
            }
            if (temp.next.no > hero.no) {
                // 位置找到，在temp后面插入
                break;
            } else if (temp.next.no == hero.no) {
                // 要添加的已经存在
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag == true) {
            System.out.println("该英雄已经存在！");
        } else {
            hero.next = temp.next;
            temp.next = hero;
            System.out.println("添加成功！");
        }
    }

    // 删除节点
    public void delete(int no) {
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        HeroNode temp = head;
        HeroNode h = new HeroNode();
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                System.out.println("没有该英雄！");
                return;
            }
            if (temp.next.no == no) {
                h = temp;
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag == true) {
            h.next = temp.next.next;
        }
    }

    // 修改节点的信息
    public void update(HeroNode hero) {
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                System.out.println("找不到该英雄，请先添加");
                return;
            }
            if (temp.no == hero.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag == true) {
            temp.name = hero.name;
            temp.nickName = hero.nickName;
            System.out.println("修改成功");
        }
    }

    // 显示链表
    public void list() {
        // 判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }

        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // 求单链表中有效节点个数（要把链表的头节点去掉）
    // 需要知道链表头节点
    public static int getLength(HeroNode head) {
        // 链表为空
        if (head.next == null) {
            return 0;
        }

        int length = 0;
        HeroNode cur = head.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    // 查找单链表中倒数第k个节点
    public static HeroNode findLastNode(HeroNode head, int k) {
        if (head.next == null) {
            return null;
        }
        // 对k进行校验
        int len = getLength(head);
        if (k <= 0 || k > len) {
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < len - k; i++) {
            cur = cur.next;
        }
        return cur;
    }

    // 单链表反转
    public static void reverseList(HeroNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        // 定义一个辅助指针 帮助遍历原链表
        HeroNode cur = head.next;
        HeroNode next = null; // 指向当前节点cur的下一个节点
        HeroNode reverseHead = new HeroNode(0, "","");
        // 遍历原来的链表，每遍历一个节点，就将其取出，并放在reverseHead的最前端
        while(cur != null) {
            // 不懂的话画图领会
            next = cur.next;
            // 将遍历到的节点cur插入到反转链表的最前端（不包括头节点）
            cur.next = reverseHead.next;  // 将cur的下一个节点指向reverseHead的下一个节点
            reverseHead.next = cur; // 将reverseHead的下一个节点指向cur
            cur = next;  // 节点后移
        }
        head.next = reverseHead.next;
    }

    // 以栈的方式实现单链表的逆序打印
    public static void revesePrint(HeroNode head) {
        if (head.next == null) {
            System.out.println("链表为空");
        }

        // 创建一个栈，将各个节点压入栈
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        // 打印出栈
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
