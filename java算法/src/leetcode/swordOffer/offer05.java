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
    public static String reverseLeftWords(String s, int n) {
    	StringBuilder res = new StringBuilder();
    	char[]  temp = s.toCharArray();
		for (int i = 0; i <n ; i++) {
			res.append(temp[i]);
		}
		return s.substring(n)+res;
	}
	public static String reverseLeftWords2(String s, int n) {
    	return s.substring(n, s.length()) + s.substring(0,n);
	}


    public static void main(String[] args) {
        String str = "We are happy.";
        System.out.println(replaceSpace(str));
		System.out.println(reverseLeftWords(str,2));
    }
}
