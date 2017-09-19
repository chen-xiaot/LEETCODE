package ArrayEasy;

public class No121BestTimetoBuyandSellStock {
	
public int maxProfit(int[] prices) {
        
        if(prices.length<=1) return 0;
        
        int minP = Integer.MAX_VALUE;
        int max=0;
        
        if(isDcreasing(prices)) return 0;
        
        for(int i=0;i<=prices.length-1;i++){   //  <= !!!
            if(prices[i]<minP){
                minP=prices[i];
            }
            
            if(max<prices[i]-minP){
                max=prices[i]-minP;
            }
        }
        System.out.println(max);
        return max;
    }


public static boolean isDcreasing(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        if(arr[i+1]>arr[i]){
            return false;
        }
    }
    return true;
}
	
	public static void main(String[] args) {
		int arr[]={7,1,5,3,6,4};
		No121BestTimetoBuyandSellStock test= new No121BestTimetoBuyandSellStock();
		test.maxProfit(arr);
	}

}
