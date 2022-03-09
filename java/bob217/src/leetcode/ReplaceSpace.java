package leetcode;

import java.util.Arrays;

public class ReplaceSpace {
    public static void main(String[] args) {
        String str = "we are happy";
        StringBuilder res = new StringBuilder();

        str.replace("w","c");

        //System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(String s){
          StringBuilder res = new StringBuilder();
          for (Character c :s.toCharArray()){
              if(c==' '){
                  res.append("%20");
              }else{
                  res.append(c);
              }
          }
          return res.toString();
    }
}
