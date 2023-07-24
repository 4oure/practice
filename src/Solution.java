import java.util.*;

public class Solution {

	public int maxProfit(int[] prices) {
		for(int price : prices){
			System.out.print(price + " ");
		}
		int lowest = prices[0];
		int lowestIndex = 0;
		for (int i = 0; i < prices.length; i++) {
			// find the lowest number
			if (prices[i] < lowest) {
				lowest = prices[i];
				lowestIndex = i;
			}
		}
		System.out.println("lowest is "+ lowest+ " at index " +lowestIndex);
		// if its at the end return 0 bc cant do anything
		if (lowestIndex == prices.length - 1) {
			return 0;
		} // get new array
		int[] newArray = Arrays.copyOfRange(prices, lowestIndex, prices.length);
		System.out.println("New array: ");
		for(int x : newArray){
			System.out.print(x+ " ");
		}

		int highest = newArray[0];
		int highestIndex = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] > highest)
				highest = newArray[i];
			highestIndex = i;
		}
		System.out.println("Highest is "+ highest+ " at index "+highestIndex);
		if (highest == newArray[0]) {
			return 0;
		}
		int dif = highest-lowest;
		System.out.println("Returning profit, which is highest("+highest+") minus lowest("+lowest+"), which is "+dif);
		return dif;

	}


	public static void main(String[] args) {

	}
}