package datastructure;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertSort {
    public static void main(String[] args) {
//        int[] arr = {101,34,119,1};
//        insertSort(arr);
        int[] arr1 = new int[800000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*8000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strdate = simpleDateFormat.format(date1);
        System.out.println("插入排序前的时间是:"+strdate);
        insertSort(arr1);
        Date date2 = new Date();
        String strdate2 = simpleDateFormat.format(date2);
        System.out.println("插入排序后的时间是"+strdate2);
    }
    //插入排序
    public static void insertSort(int[] arr){
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i <arr.length; i++) {
             insertVal = arr[i];
             insertIndex = i-1;     //即arr[i]前面这个数的下表
            while(insertIndex>=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1] = insertVal;
//            System.out.println("第"+i+"趟排序为");
//            System.out.println(Arrays.toString(arr));
        }
    }
}
