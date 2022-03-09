package leetcode;

public class TreeDis {


        private TreeNode maxNode = new TreeNode(Integer.MIN_VALUE);

        private TreeNode minNode = new TreeNode(Integer.MAX_VALUE);



        public int getDis(TreeNode root) {


            getMaxMin(root);//�ҵ������СҶ�ӽڵ�

            TreeNode lcaNode = getLCA(root);//��LCA

            int a = getNodeDis(lcaNode, maxNode);//���ֵҶ�ӽڵ㵽LCA�ľ��룻

            int b = getNodeDis(lcaNode, minNode);//��СֵҶ�ӽڵ㵽LCA�ľ��룻

            return a+b;

        }



         // ���ҵ������СҶ�ӽڵ�

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



          // LCA�����������

        public TreeNode getLCA(TreeNode root) {

            if (root == null) {// ˵���ǿ���

                return null;

            }

            if (root.val == maxNode.val || root.val == minNode.val) {// �ڵ�ǰ���ĸ��ڵ����ҵ������ڵ�֮һ

                return root;

            }

            TreeNode leftNode = getLCA(root.left);// �������еĲ��������ڵ㲢���ز��ҽ��

            TreeNode rightNode = getLCA(root.right);// �������в��������ڵ㲢���ز��ҽ��

            if (leftNode == null) {// ��������û�ҵ�����һ������������

                return rightNode;

            } else if (rightNode == null) {// ������û�ҵ�һ������������

                return leftNode;

            } else {// �����������ҵ�һ���ڵ㣬����ڵ�Ϊ�����������

                return root;

            }

        }



//��ȡҶ�ӽڵ㵽LCA����

        public int getNodeDis(TreeNode lcaNode, TreeNode node){

            if(lcaNode==null){

                return -1;

            }

            if(lcaNode.val==node.val){

                return 0;

            }

            //�����������������������������������������һ��һ�ң����Բ�����if-elseif�ṹ

            int distance = getNodeDis(lcaNode.left, node);//������δ�ҵ������ڵ�֮һ

            if(distance==-1){

                distance = getNodeDis(lcaNode.right, node);

            }

            if(distance!=-1){

                return distance+1;

            }
            return -1;
        }
    }

