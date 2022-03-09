package inittest;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sort st = new sort();
        System.out.println(st.printNums(n));
    }

        StringBuilder res;
        int n;
        char[] num, loop={'0','1','2','3','4','5','6','7','8','9'};


    public String printNums(int n){
        this.n=n;
        res=new StringBuilder();
        num=new char[n];
        dfs(0);
        res.deleteCharAt(res.length()-1);
        return  res.toString();
    }
    void dfs(int x){
        if(x==n){
            res.append(String.valueOf(num)+',');
            return;
        }
        for (char i:loop){
            num[x]=i;
            dfs(x+1);
        }
    }


}
