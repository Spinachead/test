package leetcode;

public class TreeDis {


        private TreeNode maxNode = new TreeNode(Integer.MIN_VALUE);

        private TreeNode minNode = new TreeNode(Integer.MAX_VALUE);



        public int getDis(TreeNode root) {


            getMaxMin(root);//找到最大最小叶子节点

            TreeNode lcaNode = getLCA(root);//找LCA

            int a = getNodeDis(lcaNode, maxNode);//最大值叶子节点到LCA的距离；

            int b = getNodeDis(lcaNode, minNode);//最小值叶子节点到LCA的距离；

            return a+b;

        }



         // 先找到最大最小叶子节点

        public void getMaxMin(TreeNode root) {

            if (root == null) {

                return;

            }

            if (root.left == null && root.right == null) {

                if (root.val > maxNode.val) {

                    maxNode = root;

                } else if (root.val < minNode.val) {

                    minNode = root;

                }

            }

            getMaxMin(root.left);

            getMaxMin(root.right);

        }



          // LCA最近公共祖先

        public TreeNode getLCA(TreeNode root) {

            if (root == null) {// 说明是空树

                return null;

            }

            if (root.val == maxNode.val || root.val == minNode.val) {// 在当前树的根节点上找到两个节点之一

                return root;

            }

            TreeNode leftNode = getLCA(root.left);// 左子树中的查找两个节点并返回查找结果

            TreeNode rightNode = getLCA(root.right);// 右子树中查找两个节点并返回查找结果

            if (leftNode == null) {// 左子树中没找到，则一定在右子树上

                return rightNode;

            } else if (rightNode == null) {// 右子树没找到一定在左子树上

                return leftNode;

            } else {// 左右子树均找到一个节点，则根节点为最近公共祖先

                return root;

            }

        }



//获取叶子节点到LCA距离

        public int getNodeDis(TreeNode lcaNode, TreeNode node){

            if(lcaNode==null){

                return -1;

            }

            if(lcaNode.val==node.val){

                return 0;

            }

            //三种情况：两个均在左子树；两个均在右子树；一左一右，所以不能用if-elseif结构

            int distance = getNodeDis(lcaNode.left, node);//左子树未找到两个节点之一

            if(distance==-1){

                distance = getNodeDis(lcaNode.right, node);

            }

            if(distance!=-1){

                return distance+1;

            }
            return -1;
        }
    }


