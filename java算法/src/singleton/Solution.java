package singleton;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // System.out.println(solution(n));
       solution(n);
    }
    public static  int solution (int n) {

        int curr=1;
        int increment=2;
        for(int i=2;i<=n;)
        {
            int j=0;
            while(j<increment&&i<=n)
            {

                curr+=increment;
                j++;
                i++;
            }
            increment++;
        }
        System.out.println(curr);
        return curr;
    }
}
