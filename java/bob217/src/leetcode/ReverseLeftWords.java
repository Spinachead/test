package leetcode;

import java.util.ArrayList;

public class ReverseLeftWords {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();

        String str="abcde";
        System.out.println(reverseLeftWords(str,2));
        System.out.println(reverseLeftWords2(str,3));


    }
    public static String reverseLeftWords(String s,int n){
        StringBuilder res = new StringBuilder();
        String next = s.substring(n);

        int count=0;
        for(int i=0;i<s.length();i++){
           if(i<next.length()){
               res.append(next.charAt(i));
           }else{
                  if(count<n){
                      res.append(s.charAt(count));
                      count++;
                  }else{
                      break;
                  }

           }
        }

      return res.toString();
    }

    public static String reverseLeftWords2(String str,int n){
        StringBuilder res = new StringBuilder();
        for (int i = n; i <str.length() ; i++) {
            res.append(str.charAt(i));
        }
        for (int i = 0; i <n; i++) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}
