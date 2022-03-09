package leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 找出数组中重复的数字。
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class RepeatNumber {
    public static void main(String[] args) {
        int[] test = {2,3,1,0,2,5,3};
//        System.out.println(finRepeatNumber(test));
        System.out.println(arrayRepeatNumber(test));
    }
    public static int finRepeatNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for(int num : nums) {
            if(dic.contains(num)) return num;
            dic.add(num);
        }
        return -1;
    }
    /*原地交换数组*/
    public static int arrayRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[i] == nums[nums[i]]) return nums[i];
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }

}
