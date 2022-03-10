package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumber {
    public static void main(String[] args) {
        int m=(0+1)/2;
        System.out.println(m);
        int[] nums={1,2,2,2,3,4,5,6};
        int[] nums2={0,1,3};
        System.out.println(findRepeatNumber(nums));
        System.out.println(search(nums,100));
        System.out.println(missingNumber(nums2));
    }
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for(int num:nums){
            if(dic.contains(num)) return num;
            dic.add(num);
        }
        return -1;
    }
    //统计一个数字在排序数组中出现的次数
    public static int search(int[] nums,int n){
        Set<Integer> dic = new HashSet<>();
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==n) count=1;
        }
        for(int num:nums){

            if(dic.contains(num) && (num==n)){
                count++;
            }
            dic.add(num);
        }
        return count;
    }
    /*一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
    在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字
     */

    public static int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }


}
