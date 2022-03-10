package datastructure.Tree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        HeroNode root = new HeroNode(1, "�ν�1");
        HeroNode node2 = new HeroNode(2, "����2");
        HeroNode node3 = new HeroNode(3, "¬����3");
        HeroNode node4 = new HeroNode(4, "�ֳ�4");
        HeroNode node5 = new HeroNode(5, "��ʤ5");
        HeroNode node6 = new HeroNode(6, "С��");
        HeroNode node7 = new HeroNode(7, "С��");
        root.setLeft(node2);
        root.setRight(node3);
        node2.setRight(node5);
        node2.setLeft(node4);
        node3.setRight(node7);
        node3.setLeft(node6);
        binaryTree.setRoot(root);
        System.out.println("ǰ�����");
        binaryTree.preOrder();
//        //ɾ��ĳ���ڵ���ǰ�����
//        binaryTree.delNode(5);
//        binaryTree.preOrder();
        System.out.println("�������");
        binaryTree.infixOrder();
//        System.out.println("�������");
//        binaryTree.postOrder();
    }
}
class BinaryTree{
    private HeroNode root;
    //���ø��ڵ�
    public void setRoot(HeroNode root){
        this.root = root;
    }
    //����ǰ�����
    public void preOrder(){
        if(this.root!=null){
            this.root.preOrder();
        }else{
            System.out.println("������Ϊ�գ��޷�����ǰ�����");
        }
    }
    //�����������
    public void infixOrder(){
        if(this.root!=null){
            this.root.infixOrder();
        }else{
            System.out.println("������Ϊ�գ��޷������������");
        }
    }
    //���ú������
    public void postOrder(){
        if(this.root!=null){
            this.root.postOrder();
        }else{
            System.out.println("������Ϊ�գ��޷����ú������");
        }
    }
    //����ɾ���ڵ�
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
    //ǰ���������
    public void preOrder(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preOrder();    //�ݹ����������ǰ�����
        }
        if(this.right!=null){
            this.right.preOrder();   //�ݹ����������ǰ�����
        }
    }
    //�����������
    public void infixOrder(){
        if(this.left!=null){
            this.left.infixOrder();  //�ݹ�����������������
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }
    //�����������
    public void postOrder(){
        if(this.left!=null){
            this.left.postOrder();   //�ݹ���������������������
        }
        if(this.right!=null){
            this.right.postOrder();   //�ݹ���������������������
        }
        System.out.println(this);
    }
    //�ݹ�ɾ���ڵ㣬���ɾ���Ľڵ���Ҷ�ӽڵ���ɾ���ڵ㣬����Ƿ�Ҷ�ӽڵ���ɾ���ýڵ������
    public void delNode(int no){
        //�����ǰ�ڵ�����ӽڵ㲻Ϊ�գ��������ӽڵ����Ҫɾ���Ľڵ�ͽ�this.left=null�����ҷ���
        if(this.left!=null && this.left.no==no){
            this.left=null;
            return;
        }
        if(this.right!=null && this.right.no==no){
            this.right=null;
            return;
        }
        //���������еݹ�ɾ��
        if(this.left!=null){
            this.left.delNode(no);
        }
        //���������еݹ�ɾ��
        if(this.right!=null){
            this.right.delNode(no);
        }
    }
}
