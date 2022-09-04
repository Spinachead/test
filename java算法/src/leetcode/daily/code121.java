package leetcode.daily;

import java.util.Arrays;

/**
 * 121 买股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0
 *
 */
public class code121 {

	//自己想的暴力解法
	public int maxProfitBob(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length-1; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if(prices[j]-prices[i]>0 && prices[j]-prices[i]>=max ) {
					max = prices[j]-prices[i];
				}
			}
		}
		return max;
	}

	//题解
	public int maxProfit(int prices[]) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice) {
				minprice = prices[i];
			} else if (prices[i] - minprice > maxprofit) {
				maxprofit = prices[i] - minprice;
			}
		}
		return maxprofit;
	}



	public static void main(String[] args) {
		code121  code121 = new code121();
		int[] test = {7,1,5,3,6,4};
		System.out.println(code121.maxProfit(test));


	}
}
