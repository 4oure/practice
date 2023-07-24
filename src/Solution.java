class Solution {
	public int maxProfit(int[] prices) {
		if(prices.length < 2)
			return 0;
		int highDif = 0;
		int minPrice = prices[0];
		for(int i = 1; i < prices.length; i++) {
			int currentProfit = prices[i] - minPrice;
			if(currentProfit > highDif){
				highDif=currentProfit;}
			if(prices[i] < minPrice){
				minPrice=prices[i];
			}
		}
		return highDif;
	}
}