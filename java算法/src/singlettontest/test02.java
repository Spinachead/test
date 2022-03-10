package singlettontest;

import singleton.Singleton02;
import singleton.test;

public class test02 {
    public static void main(String[] args) {
        int[] nums={3,4,5,7,2};
        System.out.println(minArray2(nums));
    }
    /*
    剑指 Offer 11. 旋转数组的最小数字
    */

    public static int minArray2(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }
    /*剑指 Offer 04. 二维数组中的查找
    在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
          int i=matrix.length-1, j=0;
          while(i>=0 && j<matrix[0].length){
               if(matrix[i][j]>target) i--;
               else if(matrix[i][j]<target) j++;
               else return true;
          }
          return false;
    }

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        for (int i = 0; i <matrix.length-1; i++) {
            for (int j = 0; j <matrix[0].length-1; j++) {
                if(matrix[i][j]==target) return true;
            }
        }
          return  false;
    }

}
