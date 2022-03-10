package datastructure;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
      int arr[] = {8,4,5,7,1,3,6,2};
      int temp[] = new int[arr.length];
      mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }
    //�鲢���򣬷�+�͵�ȫ��
    public static void mergeSort(int[] arr, int left, int right, int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            //����ݹ���зֽ�
            mergeSort(arr,left,mid,temp);
            //���ҵݹ���зֽ�
            mergeSort(arr,mid+1,right,temp);
            //�ϲ�
            merge(arr,left,mid,right,temp);
        }
    }

    /**
     *
     * @param arr   �����ԭʼ����
     * @param left  ����������еĳ�ʼ����
     * @param mid   �м�����
     * @param right  �ұ�����
     * @param temp   ����ת������
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i = left;   //��ʼ��i,����������еĳ�ʼ����
        int j = mid+1;  //��ʼ��j,�ұ��������еĳ�ʼ������
        int t = 0;      //ָ��temp����ĵ�ǰ����
        /*
         <->�Ȱ���������(����)�����ݰ��չ�����䵽temp���飬ֱ���������ߵ�����������һ�ߴ������
         */
        while(i<=mid && j<=right){
           if(arr[i]<=arr[j]){
               temp[t]=arr[i];
               t+=1;
               i+=1;
           }
           else{
               temp[t]=arr[j];
               t+=1;
               j+=1;
           }
        }

        /*
         <��>����ʣ�����ݵ�һ�ߵ�����һ��ȫ����䵽temp����
         */
        while(i<=mid){
            temp[t]=arr[i];
            t+=1;
            i+=1;
        }
        while(j<=right){
            temp[t]=arr[j];
            t+=1;
            j+=1;
        }

        /*
         <��> ��temp����Ԫ�ؿ�����arr��ע�Ⲣ����ÿ�ο�������Ԫ��
         */
        t=0;
        int tempLeft = left;
        while(tempLeft<=right){
            arr[tempLeft] = temp[t];
            t+=1;
            tempLeft+=1;
        }
    }
}
