package datastructure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

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
        System.out.println("��������ǰ��ʱ����:"+strdate);
        quicksort(arr1,0,arr1.length-1);
        Date date2 = new Date();
        String strdate2 = simpleDateFormat.format(date2);
        System.out.println("ϣ��������ʱ����"+strdate2);
    }

    public static void quicksort(int[] arr, int left,int right){
        int l = left;    //���±�
        int r = right;   //���±�
        int pivot = arr[(left+right)/2];    //pivotΪ����
        int temp;    //��ʱ����,��Ϊ����ʹ��
        while (l<r){     //whileѭ����Ŀ�����ñ�pivotֵС�ķŵ���߱�pivotֵ��ķ��ұ�
            while(arr[l]<pivot){   //��pivot�����һֱ�ҵ����ڵ���pivot��ֵ���˳�
                l+=1;
            }
            while(arr[r]>pivot){   //��pivot���ұ�һֱ�ҵ�С�ڵ���pivot��ֵ���˳�
                r-=1;
            }
            if(l>=r){     //���l>=r˵��pivot�����������Ѿ��������ȫ��С�ڵ���pivot��ֵ���ұ�ȫ�Ǵ��ڵ���pivot��ֵ
                break;
            }
            //����
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if(arr[l]==pivot){  //��������������arr[l]==pivot,r--, ǰ��;
                r-=1;
            }

            if(arr[r]==pivot){  //����
                l+=1;
            }
        }
        //���l==r,����l++��r-- ��������ջ���
        if(l==r){
            l+=1;
            r-=1;
        }
        if(left<r) {  //����ݹ�
            quicksort(arr, left, r);
        }
        if(right>l){  //���ҵݹ�
            quicksort(arr,l,right);
        }
    }
}
