package leetcode10;

// Integer.MAX_VALUE  


public class NO121maxProfit {

	 public int maxProfit(int prices[]) {
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length - 1; i++) {
	            for (int j = i + 1; j < prices.length; j++) {    // attention to the range of i and j
	                int profit = prices[j] - prices[i];
	                if (profit > maxprofit)
	                    maxprofit = profit;
	            }
	        }
	        System.out.println(maxprofit);
	        return maxprofit;
}
    
	 public int maxProfitSecondSolution(int prices[]) {
		 int minprice=Integer.MAX_VALUE;
		 int maxprofit=0;
		 for(int i=0;i<prices.length;i++){
			 if(prices[i]<minprice){
				 minprice=prices[i];
			 }
			 else if(maxprofit<prices[i]-minprice){
				 maxprofit=prices[i]-minprice;
			 }
		 }
		System.out.println(maxprofit);
		return maxprofit;
		 
	 }

	 
	 
	
	public static void main(String[] args) {
		NO121maxProfit tester = new NO121maxProfit();
		int[] prices=new int[]{7,6,5,4};
		tester.maxProfit(prices);
		tester.maxProfitSecondSolution(prices);

	}

}
