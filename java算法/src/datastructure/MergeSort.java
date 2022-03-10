package datastructure;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
      int arr[] = {8,4,5,7,1,3,6,2};
      int temp[] = new int[arr.length];
      mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }
    //归并排序，分+和的全部
    public static void mergeSort(int[] arr, int left, int right, int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            //向左递归进行分解
            mergeSort(arr,left,mid,temp);
            //向右递归进行分解
            mergeSort(arr,mid+1,right,temp);
            //合并
            merge(arr,left,mid,right,temp);
        }
    }

    /**
     *
     * @param arr   排序的原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right  右边索引
     * @param temp   做中转的数组
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i = left;   //初始化i,左边有序序列的初始索引
        int j = mid+1;  //初始化j,右边有序序列的初始化索引
        int t = 0;      //指向temp数组的当前索引
        /*
         <->先把左右两边(有序)的数据按照规则填充到temp数组，直到左右两边的有序序列右一边处理完毕
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
         <二>把有剩余数据的一边的数据一次全部填充到temp里面
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
         <三> 将temp数组元素拷贝到arr，注意并不是每次拷贝所有元素
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
