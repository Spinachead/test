package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class getleastNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();
        String[] arr = str.split(",");
        int[] b = new int[arr.length];

        for (int i = 0; i<b.length; i++) {
           b[i] = Integer.parseInt(arr[i]);
        }
        sc.close();
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
        for (int i:getleastnumbers(b,4)  ) {
            System.out.println(i);
        }
    }
    public static int[] getleastnumbers(int[] arr,int k){
       int[] var = new int[k];
      Arrays.sort(arr);
      for(int i=0;i<k;i++){
          var[i]=arr[i];
      }
      return var;
    }

}
