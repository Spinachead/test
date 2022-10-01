package leetcode.daily;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class code283 {
	/**
	 * 参考的题解
	 *
	 * @param nums
	 */
	public static void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}
		for (int i = j; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 1, 2};
		moveZeroes(arr);

	}
}
