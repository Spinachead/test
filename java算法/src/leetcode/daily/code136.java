package leetcode.daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class code136 {
	//自己想的
	public int singleNumberBob(int[] nums) {
		Arrays.sort(nums);
		int single = nums[0];
		for (int i = 1; i < nums.length - 1; i++) {
			if (single == nums[i]) {
				single = nums[i + 1];
			}
		}
		return single;
	}

	//模仿题解 map的方式
	public int singleNumberMap(int[] nums) {
		Map<Integer, Integer> testMap = new HashMap<>();
		for (Integer i : nums) {
			Integer count = testMap.get(i);
			count = count == null ? 1 : ++count;
			testMap.put(i, count);

		}
		for (Integer i : testMap.keySet()) {
			Integer count = testMap.get(i);
			if (count == 1) {
				return i;
			}
		}
		return -1;
	}

	//异或的方式
	public int singleNumber(int[] nums) {
		int single = 0;
		for (int num : nums) {
			single ^= num;
		}
		return single;
	}


	public static void main(String[] args) {
		code136 code136 = new code136();
		int[] test = {2, 2, 1};
		System.out.println(code136.singleNumber(test));
	}

}
