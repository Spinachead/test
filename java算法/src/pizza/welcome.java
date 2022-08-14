package pizza;

import java.util.Scanner;

public class welcome {
	public static void welcome(String[] str) {
		for(String s : str ) {
			System.out.println(s);
		}
	}
	public static void testString(String str){
		str = str.substring(0,3) + 'p';
		System.out.println(str);
	}
	public static void testScanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("你的名字");
		String name = scanner.nextLine();
		System.out.println("请输入你的年龄");
		int age = scanner.nextInt();
		System.out.println("你的名字是"+name+"你的年龄是"+age);
	}
	public static void testArray() {
		int[][] arr = new int[][] {{1,2},{3,4}};
		for (int i = 0; i <arr.length ; i++) {
			for (int j = 0; j <2 ; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		String[] gretting = new String[3];
		gretting[0] = "hello";
		gretting[1] = "bob";
		gretting[2] = "Thanks";
//        testScanner();
		testArray();



	}

}
