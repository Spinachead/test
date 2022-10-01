package leetcode.daily;

/**
 * 303. 区域和检索 - 数组不可变
 * 给定一个整数数组  nums，处理以下类型的多个查询:
 * <p>
 * 计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的 和 ，其中 left <= right
 */
public class code303 {
	/**
	 * 没看懂题目直接抄的题解
	 *
	 * @param nums
	 */
	private int[] sums;

	public void NumArray(int[] nums) {
		int n = nums.length;
		sums = new int[n + 1];
		for (int i = 0; i < n; i++) {
			sums[i + 1] = sums[i] + nums[i];
		}
	}

	public int sumRange(int i, int j) {
		return sums[j + 1] - sums[i];
	}


	public static void main(String[] args) {

	}


}
