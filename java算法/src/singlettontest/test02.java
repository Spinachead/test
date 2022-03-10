package singlettontest;

import singleton.Singleton02;
import singleton.test;

public class test02 {
    public static void main(String[] args) {
        int[] nums={3,4,5,7,2};
        System.out.println(minArray2(nums));
    }
    /*
    ��ָ Offer 11. ��ת�������С����
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
    /*��ָ Offer 04. ��ά�����еĲ���
    ��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
    �����һ����Ч�ĺ���������������һ����ά�����һ���������ж��������Ƿ��и�������
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
