package leetcode.daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 169 多数元素
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class code169 {
	//自己想的
	public int majorityElement(int[] nums) {
		int length = nums.length / 2;
		Map<Integer, Integer> testMap = new HashMap<>();
		for (Integer i : nums) {
			Integer count = testMap.get(i);
			count = count == null ? 1 : ++count;
			testMap.put(i, count);
		}
		for (Integer num : testMap.keySet()) {
			Integer count = testMap.get(num);
			if (count > nums.length / 2) {
				return num;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		code169 code169 = new code169();
		int[] test = {3, 2, 3};
		System.out.println(code169.majorityElement(test));
	}
}
