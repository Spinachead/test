package inittest;

import java.util.Scanner;
/**
 * 交换两个数据
 *
 * @author Administrator
 *
 */
public class Swap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a  = input.nextInt();
        int b = input.nextInt();
        int []arr = new int[2];
        int []crr;
        arr[0] = a;
        arr[1] = b;
        crr = swap(arr[0], arr[1]);
        for(int i = 0; i<crr.length; i++){
            System.out.println(crr[i]);
        }
    }

    public static int[] swap(int x, int y){
        int arry[] = new int[2];
        arry[0] = x;
        arry[1] = y;
        int temp = 0;
        temp = arry[0];
        arry[0] = arry[1];
        arry[1] = temp;
        return arry;
    }

}

