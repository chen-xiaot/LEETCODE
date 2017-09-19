package leetcode10;

public class NO122maxProfit2 {
	
	public int maxProfit(int[] prices) {
        int maxprofit=0;
        for(int i=0; i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                maxprofit+=(prices[i+1]-prices[i]);
            }
        }
        return maxprofit;
    }

	public static void main(String[] args) {
		
	}

}
