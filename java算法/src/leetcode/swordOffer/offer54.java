package leetcode.swordOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
 */
public class offer54 {
	private static List<Integer> arr=new ArrayList<>();
	public int kthLargest(TreeNode root, int k) {
		//中序遍历,正序赋值数组
		inOrder(root);
		//寻找第k大的数，输出
		return arr.get(arr.size()-k);
	}
	//中序遍历
	private static void inOrder(TreeNode root){
		if(root==null)
			return;
		inOrder(root.left);
		arr.add(root.val);
		inOrder(root.right);

	}

	public static void main(String[] args) {

	}
}

