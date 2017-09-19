package ArrayEasy;

public class No485MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, max=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else count=0;
        }
        
        return max;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
