package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {

    }
   // ��ָ Offer 32 - II. ���ϵ��´�ӡ������ II ���ϵ��°����ӡ��������ͬһ��Ľڵ㰴�����ҵ�˳���ӡ��ÿһ���ӡ��һ�С�
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
