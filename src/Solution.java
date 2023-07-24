import java.util.Arrays;

class Solution {
	public int maxProfit(int[] prices) {
		int highDif = 0;
		for(int i = 0; i < prices.length; i++){
			int newArray[] = Arrays.copyOfRange(prices, i, prices.length);
			for (int k : newArray) {
				if (k - newArray[0] > highDif)
					highDif = k-newArray[0];
			}
		}
		return highDif;
	}

	public static void main(String[] args) {

	}
}