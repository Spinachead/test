package leetcode.daily;

/**
 * 53. 最大子数组和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分。
 *
 * @解法 要采用动态规划的方式，要把题目转换为求以nums[i]结尾的连续数组的和
 */
public class code53 {

	public static int maxSubArray(int[] nums) {
		int len = nums.length;
		int[] temp = new int[len];
		temp[0] = nums[0];
		for (int i = 1; i < len; i++) {
			if (temp[i - 1] > 0) {
				temp[i] = temp[i - 1] + nums[i];
			} else {
				temp[i] = nums[i];
			}
		}
		int res = temp[0];
		for (int j = 1; j < len; j++) {
			res = Math.max(res, temp[j]);
		}
		return res;

	}

	public static void main(String[] args) {
		int[] test = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArray(test));
	}
}
