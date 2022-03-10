package leetcode;


import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] a={-1,-2,3,4,};
        for (int i:sortedSquares(a)
             ) {
            System.out.println(i);

        }
    }
    public static int[] sortedSquares(int[] nums)
    {
        int n=nums.length;
        int[] temp = new int[n];
        for (int i = 0; i < nums.length; i++) {
            temp[i]=nums[i]*nums[i];
        }
        Arrays.sort(temp);
                return temp;
    }
}
