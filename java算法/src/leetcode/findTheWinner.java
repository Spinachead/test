package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class findTheWinner {
	public static void main(String[] args) {
		System.out.println(findTheWinners(5, 2));

	}

	/**
	 * 1823. 找出游戏的获胜者
	 * @param n
	 * @param k
	 * @return
	 */
	public static int findTheWinners(int n, int k) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		while (queue.size() > 1) {
			for (int i = 1; i < k; i++) {
				queue.offer(queue.poll());
			}
			queue.poll();
		}
		return queue.peek();
	}
}
