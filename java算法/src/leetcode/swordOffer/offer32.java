package leetcode.swordOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 */
public class offer32 {
	public static int[] levelOrder(TreeNode root) {
		if (root == null) return new int[0];
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		ArrayList<Integer> ans = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			ans.add(node.val);
			if (node.left != null) queue.add(node.left);
			if (node.right != null) queue.add(node.right);
		}
		int[] res = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			res[i] = ans.get(i);
		}
		return res;
	}

	/**
	 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
	 * @param root
	 * @return
	 */
	public static List<List<Integer>> levelOrder2(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> res = new ArrayList<>();
		if (root != null) queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> tmp = new ArrayList<>();
			for (int i = queue.size(); i > 0; i--) {
				TreeNode node = queue.poll();
				tmp.add(node.val);
				if (node.left != null) queue.add(node.left);
				if (node.right != null) queue.add(node.right);
			}
			res.add(tmp);
		}
		return res;
	}

	/**
	 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
	 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
	 * @param root
	 * @return
	 */
	public static  List<List<Integer>> levelOrder3(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> res = new ArrayList<>();
		if(root != null) queue.add(root);
		while(!queue.isEmpty()) {
			LinkedList<Integer> tmp = new LinkedList<>();
			for(int i = queue.size(); i > 0; i--) {
				TreeNode node = queue.poll();
				if(res.size() % 2 == 0) tmp.addLast(node.val); // 偶数层 -> 队列头部
				else tmp.addFirst(node.val); // 奇数层 -> 队列尾部
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
			}
			res.add(tmp);
		}
		return res;
	}


}
