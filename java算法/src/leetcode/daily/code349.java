package leetcode.daily;

import java.util.*;

/**
 * 349. 两个数组的交集
 */
public class code349 {

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();  //这里list怎么不能转为int类型的数组

		for (int i : nums1) {
			set1.add(i);
		}
		for (int i : nums2) {
			if (set1.contains(i)) {
				set2.add(i);
			}
		}
		int[] arr = new int[set2.size()];
		int j = 0;
		for (int i : set2) {
			arr[j++] = i;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 2, 3};
		int[] arr2 = {3};
		System.out.println(intersection(arr1, arr2));
	}
}
