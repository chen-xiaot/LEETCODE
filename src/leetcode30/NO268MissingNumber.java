package leetcode30;

public class NO268MissingNumber {

	 public int missingNumber(int[] nums) {
	        int numsSum=0, sum=0;
	        for(int i=0;i<nums.length;i++){
	            numsSum+=nums[i];
	        }
	        sum=nums.length*(nums.length+1)/2;
	        return sum-numsSum;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
