package leetcode.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 四数之和
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]]
 *  （若两个四元组元素一一对应，则认为两个四元组重复）：
 * 思路：双指针
 */

public class code18 {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < len - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int left = j + 1;
				int right = len - 1;

				while (left < right) {
					//注意要用long，否则相加后会溢出，由于相加时底层是用临时变量存储中间值得，因此一个数乘1L，临时变量的类型会默认为long类型
					long sum = nums[i] * 1l + nums[j] + nums[left] + nums[right];

					if (sum == target) {
						res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						//跳过重复
						while (left < right && nums[left] == nums[left + 1]) left++;
						while (left < right && nums[right] == nums[right - 1]) right--;
						//逐渐逼近中间
						left++;
						right--;
					} else if (sum > target) {
						right--;
					} else {
						left++;
					}

				}

			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = {1, 0, -1, 0, -2, 2};
		System.out.println(fourSum(nums, 0));
	}

}
