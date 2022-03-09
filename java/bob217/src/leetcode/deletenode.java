//package leetcode;
//
//import inittest.sort;
//
//public class deletenode {
//    public static void main(String[] args) {
//        ListNode h=new ListNode(4);
//
//        System.out.println(deleteNode(h,2));
//
//
//    }
//    public static ListNode deleteNode(ListNode head, int val) {
//       if(head==null) return null;
//       if (head.val==val) return head.next;
//       ListNode cur = head;
//       while(cur.next!=null&&cur.next.val!=val){
//           cur=cur.next;
//       }
//       if(cur.next!=null)
//           cur.next=cur.next.next;
//       return head;
//    }
//
//}
