package leetcode.daily;

/**
 * 66. 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class code66 {
	//自己的错误解法
	public static int[] plusOne2(int[] digits) {
		int len = digits.length;
		digits[len - 1] += 1;
		return digits;

	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >=0; i--) {
			digits[i]++;
			digits[i] %= 10;
			if (digits[i] != 0) return digits;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	public static void main(String[] args) {
		int[] test = {0};
		for (int t : plusOne(test)) {
			System.out.println(t);
		}
	}
}
