package inittest;

import java.util.Scanner;

public class TalkNum {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入人数：");
        int n=sc.nextInt();
        int[] sum=new int[n];
        int num=n;//剩余的人数
        int count=0;
        //将1~n放入sum数组中
        for(int i=0;i<n;i++){
            sum[i]=i+1;
        }
        //还可将for(int j=0;j<n;j++)改为while(true)
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(sum[k]==0){
                    continue;//sum[k]==0表示该员工做过总结离场,跳过本次迭代
                }else{
                    count++;
                    if(count==3){
                        sum[k]=0;
                        count=0;
                        num--;
                    }
                }
                if(num==1&&sum[k]!=0&&count==1){
                    System.out.println("最后剩下的是："+sum[k]+"号");
                }
            }
        }

    }
}

