package leetcode;


import java.util.ArrayList;
import java.util.Stack;

public class ReversePrint {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        head.next=l2;
        l2.next=l3;
//        reversePrint(head);
        for (int n: reversePrint(head)
             ) {
            System.out.println(n);
        }

    }
    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i <size ; i++) {
            print[i]=stack.pop().val;
        }
        return print;
    }
}
