package singleton;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));

    }
    public static int hammingWeight(int n) {
           int res =0;
           while(n!=0)
           {
               res+=n&1;
               n>>>=1;
           }
           return  res;
    }
}
