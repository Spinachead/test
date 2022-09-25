package leetcode.daily;

import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class code217 {

	/**
	 * 217. 存在重复元素
	 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false
	 *
	 * @param nums
	 * @return
	 */
	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Boolean> dic = new HashMap<>();
		for (int num : nums) {
			dic.put(num, dic.containsKey(num));
		}

		for (int num : nums) {
			if (dic.get(num)) {
				return true;
			}
		}
		return false;
	}


	/**
	 * 219. 存在重复元素 II
	 * 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false
	 * 自己想的
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public static boolean containsNearbyDuplicateBob(int[] nums, int k) {
		HashMap<Integer, Boolean> dic = new HashMap<>();
		for (int num : nums) {
			dic.put(num, dic.containsKey(num));
		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (dic.get(nums[i])) {
				for (int j = nums.length - 1; j >= 0; j--) {
					if (nums[i] == nums[j] && Math.abs(j - i) <= k && j != i) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 题解
	 */

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> dic = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (dic.containsKey(nums[i]) && i - dic.get(nums[i]) <= k) {
				return true;
			}
			dic.put(nums[i], i);

		}
		return false;

	}


	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 2, 3};
		int[] arr2 = {1, 2, 3, 4};
//		System.out.println(containsDuplicate(arr2));
//		System.out.println(containsNearbyDuplicate(arr,2));
		System.out.println(containsNearbyDuplicate(arr, 2));
	}

}
