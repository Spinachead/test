package datastructure;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr={3,9,-1,10,-2};
//        bubbleSort(arr);
//        System.out.println("排序后的数组是");
//        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[80000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*8000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strdate = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是:"+strdate);
        bubbleSort(arr1);
        Date date2 = new Date();
        String strdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是"+strdate2);
//        System.out.println("排序后的数组是");
//        System.out.println(Arrays.toString(arr1));
    }
public static void bubbleSort(int[] arr){
    int temp=0;
    boolean flag = false;
    for (int i = 0; i <arr.length-1; i++) {
        for (int j = 0; j < arr.length-1-i; j++) {
            if(arr[j]>arr[j+1]){
                flag = true;
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        if(!flag){
            break;
        }else{
            flag = false;
        }
//        System.out.println("第"+(i+1)+"趟排序为");
//        System.out.println(Arrays.toString(arr));
    }
 }
}
