package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {

    }
   // 剑指 Offer 32 - II. 从上到下打印二叉树 II 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
//    public List<List<Integer>> levelOrder(TreeNode root) {
//
//    }

    public static int[] levelOrder3(TreeNode root) {
        if(root==null) return  new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer>  tem = new ArrayList<>();
        queue.offer(root);
        while(queue.size()!=0){
            TreeNode node = queue.poll();
            tem.add(node.val);
            if(node.left!=null){queue.offer(node.left);}
            if(node.right!=null){queue.offer(node.right);}
        }
        int[] res = new int[tem.size()];
        for (int i = 0; i <res.length ; i++) {
            res[i]=tem.get(i);
        }
         return  res;
    }




}
