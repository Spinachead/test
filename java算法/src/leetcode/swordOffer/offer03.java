package leetcode.swordOffer;

import java.util.HashSet;
import java.util.Set;

public class offer03 {
	public static int findRepeatNumber(int[] nums) {
		Set<Integer> temp = new HashSet<>();
		for (int a: nums
			 ) {
			if(temp.contains(a)) return a;
			temp.add(a);
		}
		return -1;
	}
	public static int search(int[] nums, int target) {
		int a = 0;
		Set<Integer> temp = new HashSet<>();
		for (int b : nums
			 ) {
			if(temp.contains(target)) a+=1;
			temp.add(target);
		}
		return a;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,2};
		System.out.println(findRepeatNumber(nums));
		System.out.println(search(nums,1));
	}
}
