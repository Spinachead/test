package leetcode.daily;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * <p>
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 */
public class code88 {
	// 自己写的
	public static void mergeBob(int[] nums1, int m, int[] nums2, int n) {
		nums1 = Arrays.copyOfRange(nums1, 0, m);
		nums2 = Arrays.copyOfRange(nums2, 0, n);
		int length1 = nums1.length, length2 = nums2.length;
//		int[] totalArray = new int[length1+length2];
		nums1 = Arrays.copyOf(nums1, length1 + length2);
		System.arraycopy(nums2, 0, nums1, length1, length2);
		Arrays.sort(nums1);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + "    ");
		}
	}

	//题解
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;

		for (int k = m + n - 1; k >= 0; k--) {
			if (j < 0 || (i >= 0 && nums1[i] >= nums2[j])) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};
		merge(nums1, 3, nums2, 3);
	}
}
