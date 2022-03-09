package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dayfive {
    public static void main(String[] args) {
      String str ="abdbfg";
        System.out.println(firstUniqChar(str));
    }
  /*在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。*/
    public static char firstUniqChar(String s) {
       HashMap<Character,Boolean> dic = new HashMap<>();
       char[] sc = s.toCharArray();
       for(char c:sc){
           dic.put(c,!dic.containsKey(c));
       }
       for (char c: sc){
          if(dic.get(c)) return c;
       }
       return ' ';
    }
}
