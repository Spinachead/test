package leetcode.swordOffer;

import java.util.HashMap;

public class offer50 {
	public static char firstUniqChar(String s) {
		HashMap<Character,Boolean> dic = new HashMap<>();
		char[] sc = s.toCharArray();
		for(char c:sc) {
			dic.put(c,!dic.containsKey(c));
		}
		for(char c:sc) {
			if(dic.get(c)){
				return c;
			}
		}
		return ' ';
	}


	public static void main(String[] args) {
		String s = "abaccdeff";
		System.out.println(firstUniqChar(s));
	}
}
