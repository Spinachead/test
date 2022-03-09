package leetcode.swordOffer;

/**
 *剑指offer05 替换空格
 *
 */
public class offer05 {
    public static String replaceSpace(String s) {
      StringBuilder res = new StringBuilder();
      for(Character c : s.toCharArray()) {
          if(c == ' ') res.append("%20");
          else res.append(c);
      }
      return res.toString();
    }

    public static void main(String[] args) {
        String str = "We are happy.";
        System.out.println(replaceSpace(str));
    }
}
