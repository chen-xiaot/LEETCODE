package ArrayEasy;

public class No122BestTimetoBuyandSellStockII {
	
	public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                max += (prices[i+1]-prices[i]);
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
