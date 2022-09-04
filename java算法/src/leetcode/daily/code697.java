package leetcode.daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 697：数组的长度
 * 给定一个非空且只包含非负数的整数数组 nums，数组的 度 的定义是指数组里任一元素出现频数的最大值。
 * <p>
 * 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度
 */
public class code697 {
	//自己没想出来参考题解写的
	public int findShortestSubArray(int[] nums) {
		//1.定义y一个map其中key为nums的单个值，value为一个数组 int[0] 表示key在nums中出现的次数,int[1]表示第一次出现的位置，int[2]表示最后一次出现的位置
		Map<Integer, int[]> map = new HashMap<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(nums[i])) {
				map.get(nums[i])[0]++;
				map.get(nums[i])[2] = i;
			} else {
				map.put(nums[i], new int[]{1, i, i});
			}
		}
		int maxNum = 0;
		int minLen = 0;
		for (Map.Entry<Integer, int[]> Entry : map.entrySet()) {
			int[] temp = Entry.getValue();
			if (temp[0] > maxNum) {
				maxNum = temp[0];
				minLen = temp[2] - temp[1] + 1;
			} else if (temp[0] == maxNum) {
				if (temp[2] - temp[1] + 1 < minLen) {
					minLen = temp[2] - temp[1] + 1;
				}
			}
		}
		return minLen;


	}

	public static void main(String[] args) {
		code697 code697 = new code697();
		int[] test = {1, 2, 2, 3, 1};
		System.out.println(code697.findShortestSubArray(test));
	}
}
