package leetcode.daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个  无重复元素 的 有序 整数数组 nums 。
 * <p>
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 */

public class code228 {

	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		int n = nums.length, i = 0;
		while (i < n) {
			int low = i;
			i++;
			while (i < n && nums[i] == nums[i - 1] + 1) {
				i++;
			}
			int height = i - 1;
			StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
			if (low < height) {
				temp.append("->");
				temp.append(Integer.toString(nums[height]));
			}
			list.add(temp.toString());
		}
		return list;

	}


	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 5, 7};
		System.out.println(summaryRanges(arr));
	}

}
