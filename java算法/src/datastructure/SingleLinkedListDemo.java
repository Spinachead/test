package datastructure;

import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "鲁智深", "花和尚");
        HeroNode hero3 = new HeroNode(3, "李逵", "黑旋风");
        HeroNode hero4 = new HeroNode(4, "潘金莲", "娘子");
        SingleLinkedList st = new SingleLinkedList();
        st.addByorder(hero1);
        st.addByorder(hero2);
        st.addByorder(hero3);
        st.addByorder(hero4);
       // st.addByorder(hero1);
        //st.list();
        //HeroNode newhero3 = new HeroNode(3, "嘤嘤嘤", "黑旋风");
        //st.update(newhero3);
        //st.del(1);0
        System.out.println(st.getLength(st.getHead()));   
        st.list();
       // System.out.println(st.getLength(st.getHead()));
       // HeroNode res = st.findLastIndexNode(st.getHead(),1);
       // System.out.println("res"+res);
       // st.reverseList(st.getHead());
        System.out.println("逆序打印的结果");
        st.reversePrint(st.getHead());
        //st.list();

    }
}
//定义Node
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}



//定义单链表
class SingleLinkedList {
    //初始化一个头结点不存放具体数据
    private HeroNode head = new HeroNode(0, "", "");
    //返回头节点
    public HeroNode getHead() {
        return head;
    }

    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    //显示链表
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
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

    public void addByorder(HeroNode heroNode) {
        //头节点不能动，需要通过一个辅助指针来帮助找到添加的位置
        //因为单链表因此temp是位于添加位置的前一个节点
        HeroNode temp = head;
        boolean flag = false; //标识添加的编号是否存在
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > heroNode.no) { //位置找到，就在temp的后面插入
                break;
            } else if (temp.next.no == heroNode.no) //说明编号已经存在
            {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //判断flag的值
        if (flag) { //不能添加，编号已经存在
            System.out.printf("准备插入的英雄的编号%d已经存在", heroNode.no);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }

    }
        //修改节点的信息，根据no编号来修改即no编号不能改
    public void update(HeroNode newHeroNode){
        if(head.next==null)
        {
            System.out.println("链表为空");
            return;
        }
        //找到需要修改的节点，根据no编号
        HeroNode temp = head.next; //定义一个辅助变量
        boolean flag = false;  //表示是否找到改节点
        while(true)
        {
            if(temp==null){
                break;  //已经遍历完链表
            }
            if(temp.no==newHeroNode.no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag){
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        }else {
            System.out.printf("没有找到编号%d的节点,不能修改\n",newHeroNode);
        }
    }

      //删除节点
    public void del(int no){
        HeroNode temp = head;
        boolean flag = false;  //标志是否找到删除的节点
        while(true){
            if(temp.next==null){break;}
            if(temp.next.no==no){flag=true; break;}
            temp=temp.next;
        }
        if(flag){
            temp.next=temp.next.next;
        }else{
            System.out.printf("要删除的%d节点不存在\n",no);
        }

    }   

    //返回单链表的长度(如果是带头节点的链表就不统计头节点）
    public  int getLength(HeroNode head)
    {
        if(head.next==null) {return 0;}
        int length=0;
        HeroNode temp = head.next;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
          return length;
    }

    //查找单链表的倒数第k个节点
    public HeroNode findLastIndexNode(HeroNode head,int index)
    {
        if(head.next==null) { return null;}
        int size = getLength(head);
        if(index<=0 || index>size) { return null;}
        HeroNode cur = head.next;
        for (int i = 0; i <size-index ; i++) {
            cur=cur.next;
        }
        return cur;
    }

    //反转单链表
    public void reverseList(HeroNode head)
    {
        if(head.next==null || head.next.next==null) { return ;}
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0,"","");
        while(cur!=null)
        {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }

    //利用栈的数据结构将各个节点压入到栈中,然后利用栈先进后出的特点实现逆序打印
    public void reversePrint(HeroNode head){
        if(head.next==null){ return;}
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode cur = head.next;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}