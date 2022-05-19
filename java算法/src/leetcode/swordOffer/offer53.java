package leetcode.swordOffer;

public class offer53 {
	public static int search(int[] nums, int target) {
		int i = 0, j = nums.length - 1;
		while (i <= j) {
			int m = (i + j) / 2;
			if (nums[m] <= target) i = m + 1;
			else j = m - 1;
		}
		int right = i;
		if (j > 0 && nums[j] != target) return 0;
		i = 0;
		j = nums.length - 1;
		while (i <= j) {
			int m = (i + j) / 2;
			if (nums[m] < target) i = m + 1;
			else j = m - 1;
		}
		int left = j;
		return right - left - 1;
	}

	/**
	 * offer53 II 0~n-1中缺少的数字
	 * @param nums
	 * @return
	 */
	public static int missNumber(int[] nums) {
		int i = 0, j = nums.length - 1;
		while (i <= j) {
			int m = (i + j) / 2;
			if (nums[m] == m) i = m + 1;
			else j = m - 1;
		}
		return i;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8, 9};
		int[] nums2 = {0,1,2,3,5,6,7};
		System.out.println(search(nums, 8));
		System.out.println(missNumber(nums2));
	}
}
