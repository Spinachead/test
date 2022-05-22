package leetcode.swordOffer;

import java.util.Arrays;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 */
public class offer61 {
	public static boolean isStraight(char[] nums) {
		int joker =0;  //鬼的数量
		Arrays.sort(nums);
		for(int i=0; i<4; i++) {
			if(nums[i]==0) joker++;
			else if(nums[i]==nums[i+1]) return false;  //排序后有重复的说明不是顺子
		}
		return nums[4]-nums[joker]<5;
	}

	public static void main(String[] args) {
		char[] nums = {4,5,6,7,8,9,10,'J','Q','K'};
		System.out.println(isStraight(nums));
	}

}
