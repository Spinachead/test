package datastructure;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SelectSort {
    public static void main(String[] args) {
//        int[] arr = {2,9,-1,10,12,3,4,-100,99};
//        selectSort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[80000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*8000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strdate = simpleDateFormat.format(date1);
        System.out.println("选择排序前的时间是:"+strdate);
        selectSort(arr1);
        Date date2 = new Date();
        String strdate2 = simpleDateFormat.format(date2);
        System.out.println("选择排序后的时间是"+strdate2);
    }
    //选择排序
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}

