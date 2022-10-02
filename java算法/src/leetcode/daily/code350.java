package leetcode.daily;

import java.util.*;

/**
 * 350. 两个数组的交集 II
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 */

public class code350 {

	/**
	 * 自己想了一半然后参考题解
	 *
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static int[] intersect(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			return intersect(nums2, nums1);
		}
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : nums1) {
			int count = map.getOrDefault(i, 0) + 1;
			map.put(i, count);
		}
		int[] arr = new int[nums1.length];

		int index = 0;
		for (int i : nums2) {
			int count = map.getOrDefault(i, 0);
			if (count > 0) {
				arr[index++] = i;
				map.put(i, count - 1);
			} else {
				map.remove(i);
			}
		}
//		return arr;
		return Arrays.copyOfRange(arr, 0, index);

	}

	public static void main(String[] args) {
		int[] arr1 = {9, 4, 5};
		int[] arr2 = {9, 4, 9, 8, 4};
		System.out.println(intersect(arr1, arr2));
	}

}
