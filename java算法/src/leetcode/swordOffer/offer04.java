package leetcode.swordOffer;

/**
 * 剑指 Offer 04. 二维数组中的查找
 *
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 *
 */
public class offer04 {
	public static boolean findNumberIn2DArray(int[][] nums, int target) {
		int i = nums.length - 1, j = 0;
		while (i >= 0 && j < nums[0].length) {
			if (nums[i][j] > target) i--;
			else if (nums[i][j] < target) j++;
			else return true;
		}
		return false;
	}
	/**
	 * 剑指 Offer 11. 旋转数组的最小数字
	 * @param nums
	 * @return
	 */
	public static int minArray(int[] nums) {
		int i=0, j=nums.length-1;
		while (i<j) {
			int m = (i+j)/2;
			if(nums[m]>nums[j])  i=m+1;
			else if(nums[m]<nums[j]) j=m;
			else j--;
		}
		return nums[i];
	}

	public static void main(String[] args) {
		int[][] nums = {
				{1, 4, 7, 11, 15},
				{2, 5, 8, 12, 19},
				{3, 6, 9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30},
		};
		int[] nums2 = {3,4,5,6,7,1,2,3,4};
		System.out.println(minArray(nums2));
//		System.out.println(findNumberIn2DArray(nums, 20));

	}
}
