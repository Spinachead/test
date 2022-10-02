package leetcode.daily;

import java.util.*;

/**
 * 414. 第三大的数
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 */
public class code414 {

	/**
	 * 自己想的 不对
	 *
	 * @param nums
	 * @return
	 */
	public static int thirdMax(int[] nums) {
		//1.数组从大到小排序
		bubbleSort(nums);
		//2.数组放入set中，且set的大小小于3返回为空
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);   //todo:错误出现在这里， 这里添加后hashSet怎么会按照从小到大的顺序？
		}
		if (set.size() < 3) return -1;
		//3.从set中取出第三个数字返回
		int j = 0;
		for (int num : set) {
			if (j == 2) return num;
			j++;
		}
		return -1;
	}

	/**
	 * 冒泡排序(从大到小的排序）
	 *
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		int temp = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (!flag) {
				break;
			} else {
				flag = false;
			}
		}
	}

	public static int thirdMaxSort(int[] nums) {
		//1.先对数组进行从大到小的排序
		bubbleSort(nums);
		//2.循环数组如果nums[i]!=nums[i+1] 则记录这个数到返回数组中，如果返回数组的长度等于3这返回第三个数
		for (int i = 1, j = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				j++;
			}
			if (j == 3) return nums[i];
		}
		return -1;
	}

	/**
	 * 参考题解有序集合
	 */
	public static int thirdMaxTreeSet(int[] nums) {
		//1.有序集合TreeSet添加三个元素
		TreeSet<Integer> treeSet = new TreeSet<>();
		//2.TreeSet中只维护3个数据，进来一个删除最小的那个
		for (int num : nums) {
			treeSet.add(num);
			if (treeSet.size() > 3) {
				treeSet.remove(treeSet.first());
			}

		}
		//3.如果TreeSet的长度==3则返回第一个元素, 否则返回第一个元素
		return treeSet.size() == 3 ? treeSet.first() : treeSet.last();
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 5, 3, 5};
//		System.out.println(thirdMaxTreeSet(arr));
		System.out.println(thirdMaxSort(arr));
	}

}
