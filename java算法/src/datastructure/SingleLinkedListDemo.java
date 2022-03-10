package datastructure;

import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "�ν�", "��ʱ��");
        HeroNode hero2 = new HeroNode(2, "³����", "������");
        HeroNode hero3 = new HeroNode(3, "����", "������");
        HeroNode hero4 = new HeroNode(4, "�˽���", "����");
        SingleLinkedList st = new SingleLinkedList();
        st.addByorder(hero1);
        st.addByorder(hero2);
        st.addByorder(hero3);
        st.addByorder(hero4);
       // st.addByorder(hero1);
        //st.list();
        //HeroNode newhero3 = new HeroNode(3, "������", "������");
        //st.update(newhero3);
        //st.del(1);0
        System.out.println(st.getLength(st.getHead()));   
        st.list();
       // System.out.println(st.getLength(st.getHead()));
       // HeroNode res = st.findLastIndexNode(st.getHead(),1);
       // System.out.println("res"+res);
       // st.reverseList(st.getHead());
        System.out.println("�����ӡ�Ľ��");
        st.reversePrint(st.getHead());
        //st.list();

    }
}
//����Node
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



//���嵥����
class SingleLinkedList {
    //��ʼ��һ��ͷ��㲻��ž�������
    private HeroNode head = new HeroNode(0, "", "");
    //����ͷ�ڵ�
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

    //��ʾ����
    public void list() {
        if (head.next == null) {
            System.out.println("����Ϊ��");
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
        //ͷ�ڵ㲻�ܶ�����Ҫͨ��һ������ָ���������ҵ���ӵ�λ��
        //��Ϊ���������temp��λ�����λ�õ�ǰһ���ڵ�
        HeroNode temp = head;
        boolean flag = false; //��ʶ��ӵı���Ƿ����
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > heroNode.no) { //λ���ҵ�������temp�ĺ������
                break;
            } else if (temp.next.no == heroNode.no) //˵������Ѿ�����
            {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //�ж�flag��ֵ
        if (flag) { //������ӣ�����Ѿ�����
            System.out.printf("׼�������Ӣ�۵ı��%d�Ѿ�����", heroNode.no);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }

    }
        //�޸Ľڵ����Ϣ������no������޸ļ�no��Ų��ܸ�
    public void update(HeroNode newHeroNode){
        if(head.next==null)
        {
            System.out.println("����Ϊ��");
            return;
        }
        //�ҵ���Ҫ�޸ĵĽڵ㣬����no���
        HeroNode temp = head.next; //����һ����������
        boolean flag = false;  //��ʾ�Ƿ��ҵ��Ľڵ�
        while(true)
        {
            if(temp==null){
                break;  //�Ѿ�����������
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
            System.out.printf("û���ҵ����%d�Ľڵ�,�����޸�\n",newHeroNode);
        }
    }

      //ɾ���ڵ�
    public void del(int no){
        HeroNode temp = head;
        boolean flag = false;  //��־�Ƿ��ҵ�ɾ���Ľڵ�
        while(true){
            if(temp.next==null){break;}
            if(temp.next.no==no){flag=true; break;}
            temp=temp.next;
        }
        if(flag){
            temp.next=temp.next.next;
        }else{
            System.out.printf("Ҫɾ����%d�ڵ㲻����\n",no);
        }

    }   

    //���ص�����ĳ���(����Ǵ�ͷ�ڵ������Ͳ�ͳ��ͷ�ڵ㣩
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

    //���ҵ�����ĵ�����k���ڵ�
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

    //��ת������
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

    //����ջ�����ݽṹ�������ڵ�ѹ�뵽ջ��,Ȼ������ջ�Ƚ�������ص�ʵ�������ӡ
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