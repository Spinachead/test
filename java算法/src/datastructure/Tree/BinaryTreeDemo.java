package datastructure.Tree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        HeroNode root = new HeroNode(1, "宋江1");
        HeroNode node2 = new HeroNode(2, "吴用2");
        HeroNode node3 = new HeroNode(3, "卢俊义3");
        HeroNode node4 = new HeroNode(4, "林冲4");
        HeroNode node5 = new HeroNode(5, "关胜5");
        HeroNode node6 = new HeroNode(6, "小六");
        HeroNode node7 = new HeroNode(7, "小七");
        root.setLeft(node2);
        root.setRight(node3);
        node2.setRight(node5);
        node2.setLeft(node4);
        node3.setRight(node7);
        node3.setLeft(node6);
        binaryTree.setRoot(root);
        System.out.println("前序遍历");
        binaryTree.preOrder();
//        //删除某个节点后的前序遍历
//        binaryTree.delNode(5);
//        binaryTree.preOrder();
        System.out.println("中序遍历");
        binaryTree.infixOrder();
//        System.out.println("后序遍历");
//        binaryTree.postOrder();
    }
}
class BinaryTree{
    private HeroNode root;
    //设置根节点
    public void setRoot(HeroNode root){
        this.root = root;
    }
    //调用前序遍历
    public void preOrder(){
        if(this.root!=null){
            this.root.preOrder();
        }else{
            System.out.println("二叉树为空，无法调用前序遍历");
        }
    }
    //调用中序遍历
    public void infixOrder(){
        if(this.root!=null){
            this.root.infixOrder();
        }else{
            System.out.println("二叉树为空，无法调用中序遍历");
        }
    }
    //调用后序遍历
    public void postOrder(){
        if(this.root!=null){
            this.root.postOrder();
        }else{
            System.out.println("二叉树为空，无法调用后序遍历");
        }
    }
    //调用删除节点
    public void delNode(int no){
        if(root!=null){
            if(root.getNo()==no){
                root=null;
            }else{
                root.delNode(no);
            }
        }else{
            System.out.println("this Binary is empty can't del");
        }
    }
}
class HeroNode{
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
    //前序遍历方法
    public void preOrder(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preOrder();    //递归调用左子树前序遍历
        }
        if(this.right!=null){
            this.right.preOrder();   //递归调用右子树前序遍历
        }
    }
    //中序遍历方法
    public void infixOrder(){
        if(this.left!=null){
            this.left.infixOrder();  //递归调用左子树中序遍历
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }
    //后序遍历方法
    public void postOrder(){
        if(this.left!=null){
            this.left.postOrder();   //递归调用左子树后序遍历方法
        }
        if(this.right!=null){
            this.right.postOrder();   //递归调用右子树后序遍历方法
        }
        System.out.println(this);
    }
    //递归删除节点，如果删除的节点是叶子节点则删除节点，如果是非叶子节点则删除该节点的子树
    public void delNode(int no){
        //如果当前节点的左子节点不为空，并且左子节点就是要删除的节点就将this.left=null；并且返回
        if(this.left!=null && this.left.no==no){
            this.left=null;
            return;
        }
        if(this.right!=null && this.right.no==no){
            this.right=null;
            return;
        }
        //左子树进行递归删除
        if(this.left!=null){
            this.left.delNode(no);
        }
        //右子树进行递归删除
        if(this.right!=null){
            this.right.delNode(no);
        }
    }
}
