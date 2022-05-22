package datastructure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {-9,78,0,23,-567,70};
//        quicksort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[8000000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*8000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strdate = simpleDateFormat.format(date1);
        System.out.println("快速排序前的时间是:"+strdate);
        quicksort(arr1,0,arr1.length-1);
        Date date2 = new Date();
        String strdate2 = simpleDateFormat.format(date2);
        System.out.println("希尔排序后的时间是"+strdate2);
    }

    public static void quicksort(int[] arr, int left,int right){
        int l = left;    //左下标
        int r = right;   //右下标
        int pivot = arr[(left+right)/2];    //pivot为中轴
        int temp;    //临时变量,作为交换使用
        while (l<r){     //while循环的目的是让比pivot值小的放到左边比pivot值大的放右边
            while(arr[l]<pivot){   //在pivot的左边一直找到大于等于pivot的值才退出
                l+=1;
            }
            while(arr[r]>pivot){   //在pivot的右边一直找到小于等于pivot的值才退出
                r-=1;
            }
            if(l>=r){     //如果l>=r说明pivot的左右两边已经按照左边全是小于等于pivot的值，右边全是大于等于pivot的值
                break;
            }
            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if(arr[l]==pivot){  //如果交换后发现这个arr[l]==pivot,r--, 前移;
                r-=1;
            }

            if(arr[r]==pivot){  //后移
                l+=1;
            }
        }
        //如果l==r,必须l++，r-- 否则会出现栈溢出
        if(l==r){
            l+=1;
            r-=1;
        }
        if(left<r) {  //向左递归
            quicksort(arr, left, r);
        }
        if(right>l){  //向右递归
            quicksort(arr,l,right);
        }
    }
}
