package leetcode.daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */

public class code17 {

	private String letterMap[] = {
			" ",    //0
			"",     //1
			"abc",  //2
			"def",  //3
			"ghi",  //4
			"jkl",  //5
			"mno",  //6
			"pqrs", //7
			"tuv",  //8
			"wxyz"  //9
	};
	private ArrayList<String> res;


	public List<String> letterCombinations(String digits) {

		res = new ArrayList<String>();
		if (digits.equals("")) {
			return res;
		}
		findCombination(digits, 0, "");
		return res;

	}

	private void findCombination(String digits, int index, String s) {
		if(index == digits.length()) {
			res.add(s);
			return;
		}
		Character c = digits.charAt(index);
		String letters = letterMap[c - '0'];
		for (int i = 0; i < letters.length(); i++) {
			findCombination(digits, index + 1, s + letters.charAt(i));
		}
		return;
	}

	public static void main(String[] args) {
		code17 test = new code17();
		String digits = "23";
		System.out.println(test.letterCombinations(digits));
	}

}
