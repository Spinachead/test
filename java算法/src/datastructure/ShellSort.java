package datastructure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ShellSort {
    public static void main(String[] args) {
//      int[] arr = {8,9,1,7,2,3,5,4,6,0};
//      shellSort2(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[80000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*8000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strdate = simpleDateFormat.format(date1);
        System.out.println("希尔排序前的时间是:"+strdate);
        shellSort2(arr1);
        Date date2 = new Date();
        String strdate2 = simpleDateFormat.format(date2);
        System.out.println("希尔排序后的时间是"+strdate2);
        ArrayList list = new ArrayList();
    }
    //交换法的希尔排序
    public static void shellSort(int[] arr) {
        int temp = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }

            }

           // System.out.println(Arrays.toString(arr));
        }
    }
    //优化后的希尔排序 ->移动法
    public static void shellSort2(int[] arr){
        for(int gap = arr.length/2; gap>0; gap/=2){
            for(int i = gap; i<arr.length; i++){
                int j=i;
                int temp = arr[j];
                if(arr[j]<arr[j-gap]){
                    while (j-gap>=0 && temp<arr[j-gap]){
                        arr[j] = arr[j-gap];  //移动
                        j-=gap;
                    }
                    arr[j]=temp; //当退出while后,就给temp找到插入的位置
                }
            }
        }
    }
}
