package leetcode.daily;

import java.util.*;

/**
 * 448. 找到所有数组中消失的数字
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 */
public class code448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (set.add(i)) {
				res.add(i);
			}
		}

		return res;

	}

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
		System.out.println(findDisappearedNumbers(arr));
	}
}
