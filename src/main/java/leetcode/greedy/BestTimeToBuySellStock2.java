package leetcode.greedy;

public class BestTimeToBuySellStock2 {
	public int maxProfit(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}
		int maxProfit = Math.max(0, prices[1] - prices[0]);
		for (int i = 2; i < prices.length; i++) {
			maxProfit += Math.max(0, prices[i] - prices[i - 1]);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		BestTimeToBuySellStock2 stock = new BestTimeToBuySellStock2();
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(stock.maxProfit(prices)); // Output: 7
		// Additional test cases
		int[] prices2 = {1, 2, 3, 4, 5};
		System.out.println(stock.maxProfit(prices2)); // Output: 4
		int[] prices3 = {7, 6, 4, 3, 1};
		System.out.println(stock.maxProfit(prices3)); // Output: 0
	}
}
