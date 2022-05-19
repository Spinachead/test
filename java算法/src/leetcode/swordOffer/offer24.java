package leetcode.swordOffer;

import leetcode.ListNode;

public class offer24 {
	public static ListNode reverserList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode node = reverserList(head.next);
		head.next.next = head;
		head.next = null;
		return node;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		System.out.println(reverserList(node));
	}
}
