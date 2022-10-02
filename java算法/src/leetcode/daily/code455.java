package leetcode.daily;

import java.util.Arrays;

public class code455 {
	/**
	 * 自己想想的加参考题解调整
	 * (排行榜的算法可以参考这个地方）
	 *
	 * @param g
	 * @param s
	 * @return
	 */
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int num = 0;
		int temp = 0;
		for (int i = 0; i < g.length; i++) {
			for (int j = temp; j < s.length; j++) {
				if (s[j] >= g[i]) {
					num += 1;
					temp = j + 1;
					break;
				}
			}
		}
		return num;
	}

	public static int findContentChildren2(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int numOfChildren = g.length;
		int numOfCookies = s.length;
		int res = 0;//能满足的孩子数
		int tmp = 0;//临时变量，用于第二层循环的起始点，确保在遍历s数组不回溯
		for (int i = 0; i < numOfChildren; i++) {
			for (int j = tmp; j < numOfCookies; j++) {
				if (g[i] <= s[j]) {
					res++;
					tmp = j + 1;
					break;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] g = {1, 2, 3};
		int[] s = {1, 1};
		System.out.println(findContentChildren(g, s));
	}
}
