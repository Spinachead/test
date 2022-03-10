package singleton;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

         String a="1";
         String b=new String("1");

        System.out.println(a==b);

        System.out.println(a.equals(b));







    }
    public static ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode next=null;
        if(head==null){
            return null;
        }

        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}





