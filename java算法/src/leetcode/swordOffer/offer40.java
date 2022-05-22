package leetcode.swordOffer;

import java.util.Arrays;

/**
 * 快速排序
 */
public class offer40 {
	public  static int[] getLeastNumbers(int[] arr, int k) {
         quickSort(arr,0,arr.length-1);
         return Arrays.copyOf(arr,k);
	}
	public static void quickSort(int[] arr, int l, int r) {
		// 子数组长度为 1 时终止递归
		if (l >= r) return;
		// 哨兵划分操作（以 arr[l] 作为基准数）
		int i = l, j = r;
		while (i < j) {
			while (i < j && arr[j] >= arr[l]) j--;
			while (i < j && arr[i] <= arr[l]) i++;
			swap(arr, i, j);
		}
		swap(arr, i, l);
		// 递归左（右）子数组执行哨兵划分
		quickSort(arr, l, i - 1);
		quickSort(arr, i + 1, r);
	}



	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {
		int[] arr = {1,7,4,9,3,0,1,5,4,89,6,3,88,32,74};
		quickSort(arr,0,arr.length-1);
		for(int i: arr){
			System.out.println(i);
		}
//		System.out.println(arr);
//		System.out.println(getLeastNumbers(arr,3));
	}
}
