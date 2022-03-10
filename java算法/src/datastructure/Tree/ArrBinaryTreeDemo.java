package datastructure.Tree;

public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrBinaryTree tre2 = new ArrBinaryTree(arr);
        tre2.preOrder(0);
        tre2.infixOrder(0);
    }
}
//˳��洢������
class ArrBinaryTree{
    private int[] arr;  //�洢���ݽڵ������
    public ArrBinaryTree(int[] arr){
        this.arr=arr;
    }
    //��дһ���������˳��洢��������ǰ�����
    public void preOrder(int index){
        if(arr==null || arr.length==0){
            System.out.println("������Ϊ��");
        }
        //�����ǰ���Ԫ��
        System.out.println(arr[index]);
        //����ݹ����
        if((index*2+1)<arr.length){
            preOrder(2*index+1);
        }
        //���ҵݹ����
        if((index*2+2)<arr.length){
            preOrder(2*index+2);
        }
    }
    //˳��洢���������������
    public void infixOrder(int index){
        if(arr==null || arr.length==0){
            System.out.println("������Ϊ��");
        }
        //����ݹ����
        if((index*2+1)<arr.length){
            preOrder(2*index+1);
        }
        //�����ǰ���Ԫ��
        System.out.println(arr[index]);
        //���ҵݹ����
        if((index*2+2)<arr.length){
            preOrder(2*index+2);
        }
    }
}