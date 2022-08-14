package leetcode.daily;

import java.util.ArrayList;
import java.util.List;

public class code118 {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
				}
			}
			ret.add(row);
		}
		return ret;
	}

	/**
	 * 自己用二维数组写的
	 *
	 * @param numRows
	 * @return
	 */
	public static int[][] generateBob(int numRows) {
		int[][] a = new int[numRows][];
		a[0] = new int[]{1};
		a[1] = new int[]{1, 1};
		for (int i = 2; i < numRows; i++) {
			int[] b = new int[i + 1];
			b[0] = b[i] = 1;
			for (int j = 1; j < i; j++) {
				b[j] = a[i - 1][j - 1] + a[i - 1][j];
			}
			a[i] = b;
		}
		return a;
	}

	/**
	 * 119. 杨辉三角 II
	 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
	 *
	 * @param rowIndex
	 * @return
	 */
	public List<Integer> getRow(int rowIndex) {

		List<Integer> pre = new ArrayList<Integer>();
		for (int i = 0; i <= rowIndex; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(pre.get(j - 1) + pre.get(j));
				}
			}
			pre = row;
		}
		return pre;
	}

	public static void main(String[] args) {
//		generateBob(5);
		code118 test = new code118();
//		test.generate(5);
		test.getRow(3);
	}
}
