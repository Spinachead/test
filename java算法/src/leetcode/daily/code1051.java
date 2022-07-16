package leetcode.daily;

public class code1051 {
	//先冒泡排序对数组进行排序
	public static void  bubbleSort(int[] arr) {

		int temp = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
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
	public static void main(String[] args) {

		int[] arr1  = {1,1,4,2,1,3};
		int[] arr2 = new int[arr1.length];
		/**
		 * 总计把一个数组复制给另一个数组的方法
		 */
		// 1.    既然数组本质是对象，那么他就有clone()方法。我们可以使用clone()方法进行复制：
		arr2 = (int[]) arr1.clone();

		//2.    System提供了一个静态方法arraycopy(),原型如下：
		//    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//		src:源数组
//
//		srcPos:源数组要复制的起始位置
//		dest:目的数组
//
//		destPos:目的数组放置的起始位置
//		length:复制的长度
		System.arraycopy(arr1,0,arr2,0,arr1.length);




		bubbleSort(arr1);
		int nums=0;
		for(int i =0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				nums+=1;
			}
		}
		System.out.println(nums);


	}
}
