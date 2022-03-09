package inittest;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int a:printNumbers(n)
             ) {
            System.out.println(a);
        }
    }
    public static int[] printNumbers(int n)
    {
        int end = (int)Math.pow(10,n)-1;
        int[] res = new int[end];
        for (int i = 0; i <end ; i++) {
            res[i]=i+1;
        }
        return res;
    }
}
