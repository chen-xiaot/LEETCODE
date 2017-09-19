package leetcode10;

public class NO136SingleNumber {
	 public int singleNumber(int[] nums) {
	        int result=0;
	        
	        for(int i=0; i<nums.length;i++){
	            result^=nums[i];
	        }
	        
	        return result;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
