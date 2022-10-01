package leetcode.daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 */
public class code268 {

	/**
	 * 自己想的
	 * @param nums
	 * @return
	 */
	public static int missingNumber(int[] nums) {
		Map<Integer, Boolean> dic = new HashMap<>();
		for (int num : nums) {
			dic.put(num, true);
		}
		for (int i = 0; i <= nums.length; i++) {
			if (!dic.containsKey(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {3, 0, 1};
		System.out.println(missingNumber(arr));

	}
}
