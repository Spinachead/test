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
  /*���ַ��� s ���ҳ���һ��ֻ����һ�ε��ַ������û�У�����һ�����ո� s ֻ����Сд��ĸ��*/
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
