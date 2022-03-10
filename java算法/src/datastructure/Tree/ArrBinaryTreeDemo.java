package datastructure.Tree;

public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrBinaryTree tre2 = new ArrBinaryTree(arr);
        tre2.preOrder(0);
        tre2.infixOrder(0);
    }
}
//顺序存储二叉树
class ArrBinaryTree{
    private int[] arr;  //存储数据节点的数组
    public ArrBinaryTree(int[] arr){
        this.arr=arr;
    }
    //编写一个方法完成顺序存储二叉树的前序遍历
    public void preOrder(int index){
        if(arr==null || arr.length==0){
            System.out.println("二叉树为空");
        }
        //输出当前这个元素
        System.out.println(arr[index]);
        //向左递归遍历
        if((index*2+1)<arr.length){
            preOrder(2*index+1);
        }
        //向右递归遍历
        if((index*2+2)<arr.length){
            preOrder(2*index+2);
        }
    }
    //顺序存储二叉树的中序遍历
    public void infixOrder(int index){
        if(arr==null || arr.length==0){
            System.out.println("二叉树为空");
        }
        //向左递归遍历
        if((index*2+1)<arr.length){
            preOrder(2*index+1);
        }
        //输出当前这个元素
        System.out.println(arr[index]);
        //向右递归遍历
        if((index*2+2)<arr.length){
            preOrder(2*index+2);
        }
    }
}