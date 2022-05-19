package leetcode.swordOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 复杂链表的复制
 * 难度：中等
 */
public class offer35 {
	public static copyNode copyRandomList(copyNode head) {
		if(head == null) return null;
		copyNode cur = head;
		Map<copyNode,copyNode> map = new HashMap<>();
		// 3. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
		while(cur != null) {
			map.put(cur, new copyNode(cur.val));
			cur = cur.next;
		}
		cur = head;
		// 4. 构建新链表的 next 和 random 指向
		while(cur != null) {
			map.get(cur).next = map.get(cur.next);
			map.get(cur).random = map.get(cur.random);
			cur = cur.next;
		}
		// 5. 返回新链表的头节点
		return map.get(head);
	}

}
class copyNode {
	int val;
	copyNode next,random;
	public copyNode(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}
